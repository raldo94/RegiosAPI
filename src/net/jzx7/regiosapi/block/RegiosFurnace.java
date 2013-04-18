package net.jzx7.regiosapi.block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.jzx7.jnbt.CompoundTag;
import net.jzx7.jnbt.ListTag;
import net.jzx7.jnbt.NBTUtils;
import net.jzx7.jnbt.ShortTag;
import net.jzx7.jnbt.StringTag;
import net.jzx7.jnbt.Tag;
import net.jzx7.regiosapi.exceptions.InvalidNBTData;
import net.jzx7.regiosapi.inventory.RegiosItemStack;

public class RegiosFurnace extends RegiosContainer {

	private short burnTime;
    private short cookTime;
	
	public RegiosFurnace(int id) {
		super(id, 2);
	}
	
	public RegiosFurnace(int id, byte data) {
		super(id, data, 2);
	}
	
	public RegiosFurnace(int id, byte data, RegiosItemStack[] items) {
        super(id, data, 2);
        setContents(items);
    }

	@Override
	public String getNBTID() {
		return "Furnace";
	}

	@Override
	public CompoundTag getNBTData() {
		Map<String, Tag> values = new HashMap<String, Tag>();
        values.put("Items", new ListTag("Items", CompoundTag.class,
                serialize(getContents())));
        values.put("BurnTime", new ShortTag("BurnTime", burnTime));
        values.put("CookTime", new ShortTag("CookTime", cookTime));
        return new CompoundTag(getNBTID(), values);
	}

	@Override
	public void setNBTData(CompoundTag nbtData) throws InvalidNBTData {
		if (nbtData == null) {
            return;
        }
        
        Map<String, Tag> values = nbtData.getValue();

        Tag t = values.get("id");
        if (!(t instanceof StringTag)
                || !((StringTag) t).getValue().equals("Furnace")) {
            throw new InvalidNBTData("'Furnace' tile entity expected");
        }

        ListTag items = NBTUtils.getChildTag(values, "Items", ListTag.class);

        List<CompoundTag> compound = new ArrayList<CompoundTag>();

        for (Tag tag : items.getValue()) {
            if (!(tag instanceof CompoundTag)) {
                throw new InvalidNBTData(
                        "CompoundTag expected as child tag of Furnace Items");
            }
            compound.add((CompoundTag) tag);
        }
        setContents(deserialize(compound, 2));

        t = values.get("BurnTime");
        if (t instanceof ShortTag) {
            burnTime = ((ShortTag) t).getValue();
        }

        t = values.get("CookTime");
        if (t instanceof ShortTag) {
            cookTime = ((ShortTag) t).getValue();
        }
		
	}

	/**
	 * @return the burnTime
	 */
	public short getBurnTime() {
		return burnTime;
	}

	/**
	 * @param burnTime the burnTime to set
	 */
	public void setBurnTime(short burnTime) {
		this.burnTime = burnTime;
	}

	/**
	 * @return the cookTime
	 */
	public short getCookTime() {
		return cookTime;
	}

	/**
	 * @param cookTime the cookTime to set
	 */
	public void setCookTime(short cookTime) {
		this.cookTime = cookTime;
	}
	
}