package net.jzx7.regiosapi.block;

import java.util.HashMap;
import java.util.Map;

import net.jzx7.jnbt.CompoundTag;
import net.jzx7.jnbt.NBTUtils;
import net.jzx7.jnbt.ShortTag;
import net.jzx7.jnbt.StringTag;
import net.jzx7.jnbt.Tag;
import net.jzx7.regiosapi.exceptions.InvalidNBTData;

public class RegiosSpawner extends RegiosBlock implements NBTData {
	
    private String mobType;
    private int delay;
	
	public RegiosSpawner(int id) {
		super(id);
		this.mobType = "PIG";
	}
	
	public RegiosSpawner(int id, String mobType) {
		super(id);
		this.mobType = mobType;
	}
	
	public RegiosSpawner(int id, byte data) {
		super(id, data);
		this.mobType = "PIG";
	}
	
	public RegiosSpawner(int id, byte data, String mobType) {
        super(id, data);
        this.mobType = mobType;
    }

	@Override
	public String getNBTID() {
		return "MobSpawner";
	}

	@Override
	public CompoundTag getNBTData() {
		Map<String, Tag> values = new HashMap<String, Tag>();
        values.put("EntityId", new StringTag("EntityId", mobType));
        values.put("Delay", new ShortTag("Delay", (short) delay));
        return new CompoundTag(getNBTID(), values);
	}

	@Override
	public void setNBTData(CompoundTag nbtData) throws InvalidNBTData {
		if (nbtData == null) {
            return;
        }

        Map<String, Tag> values = nbtData.getValue();

        Tag t = values.get("id");
        if (!(t instanceof StringTag) || !((StringTag) t).getValue().equals("MobSpawner")) {
            throw new InvalidNBTData("'MobSpawner' tile entity expected");
        }

        StringTag mobTypeTag = NBTUtils.getChildTag(values, "EntityId", StringTag.class);
        ShortTag delayTag = NBTUtils.getChildTag(values, "Delay", ShortTag.class);

        this.mobType = mobTypeTag.getValue();
        this.delay = delayTag.getValue();
    }

	/**
	 * @return the mobType
	 */
	public String getMobType() {
		return mobType;
	}

	/**
	 * @param mobType the mobType to set
	 */
	public void setMobType(String mobType) {
		this.mobType = mobType;
	}

	/**
	 * @return the delay
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * @param i the delay to set
	 */
	public void setDelay(int i) {
		this.delay = i;
	}
}