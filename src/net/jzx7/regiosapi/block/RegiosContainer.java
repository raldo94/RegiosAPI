package net.jzx7.regiosapi.block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.jzx7.jnbt.ByteTag;
import net.jzx7.jnbt.CompoundTag;
import net.jzx7.jnbt.ListTag;
import net.jzx7.jnbt.NBTUtils;
import net.jzx7.jnbt.ShortTag;
import net.jzx7.jnbt.Tag;
import net.jzx7.regiosapi.inventory.RegiosItemStack;

public abstract class RegiosContainer extends RegiosBlock implements NBTData {

	private RegiosItemStack[] items;
	
	public RegiosContainer(int id, int inventorySize) {
		super(id);
		this.items = new RegiosItemStack[inventorySize];
	}
	public RegiosContainer(int id, byte data, int inventorySize) {
		super(id, data);
		this.items = new RegiosItemStack[inventorySize];
	}

	public RegiosItemStack[] getContents() {
		return items;
	}
	
	public void setContents(RegiosItemStack[] ris) {
		items = ris;
	}
	
	public void clearInventory() {
		int size = items.length;
		items = new RegiosItemStack[size];
	}
	
	public List<CompoundTag> serialize(RegiosItemStack[] items) {
		List<CompoundTag> tags = new ArrayList<CompoundTag>();
		for (int i = 0; i < items.length; ++i) {
			if (items[i] != null) {
				Map<String, Tag> tagData = new HashMap<String, Tag>();
				tagData.put("id", new ShortTag("id", (short) items[i].getId()));
				tagData.put("Damage", new ShortTag("Damage", items[i].getData()));
				tagData.put("Count", new ByteTag("Count", (byte) items[i].getAmount()));
				if (items[i].getEnchantments().size() > 0) {
					List<CompoundTag> enchantmentList = new ArrayList<CompoundTag>();
					for(Map.Entry<Integer, Integer> entry : items[i].getEnchantments().entrySet()) {
						Map<String, Tag> enchantment = new HashMap<String, Tag>();
						enchantment.put("id", new ShortTag("id", (short) entry.getKey().shortValue()));
						enchantment.put("lvl", new ShortTag("lvl", entry.getValue().shortValue()));
						enchantmentList.add(new CompoundTag(null, enchantment));
					}

					Map<String, Tag> auxData = new HashMap<String, Tag>();
					auxData.put("ench", new ListTag("ench", CompoundTag.class, enchantmentList));
					tagData.put("tag", new CompoundTag("tag", auxData));
				}
				tagData.put("Slot", new ByteTag("Slot", (byte) i));
				tags.add(new CompoundTag("", tagData));
			}
		}
		return tags;
	}
	
	public RegiosItemStack[] deserialize(List<CompoundTag> items, int invSize) {
		RegiosItemStack[] stacks = new RegiosItemStack[invSize];
		for (CompoundTag tag : items) {
			Map<String, Tag> itemTag = tag.getValue();
			short id = NBTUtils.getChildTag(itemTag, "id", ShortTag.class).getValue();
			short damage = NBTUtils.getChildTag(itemTag, "Damage", ShortTag.class).getValue();
			byte count = NBTUtils.getChildTag(itemTag, "Count", ByteTag.class).getValue();

			RegiosItemStack stack = new RegiosItemStack(id, count, damage);

			if (itemTag.containsKey("tag")) {
				Map<String, Tag> auxData = NBTUtils.getChildTag(itemTag, "tag", CompoundTag.class).getValue();
				ListTag ench = (ListTag)auxData.get("ench");
				for(Tag e : ench.getValue()) {
					Map<String, Tag> vars = ((CompoundTag) e).getValue();
					short enchId = NBTUtils.getChildTag(vars, "id", ShortTag.class).getValue();
					short enchLevel = NBTUtils.getChildTag(vars, "lvl", ShortTag.class).getValue();
					stack.getEnchantments().put((int) enchId, (int) enchLevel);
				}
			}
			byte slot = NBTUtils.getChildTag(itemTag, "Slot", ByteTag.class).getValue();
			if (slot >= 0 && slot < stacks.length) {
				stacks[slot] = stack;
			}
		}
		return stacks;
	}
}