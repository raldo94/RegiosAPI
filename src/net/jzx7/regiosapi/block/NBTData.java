package net.jzx7.regiosapi.block;

import net.jzx7.jnbt.CompoundTag;
import net.jzx7.regiosapi.exceptions.InvalidNBTData;

public interface NBTData {
	
	String getNBTID();
	
	CompoundTag getNBTData();

    void setNBTData(CompoundTag nbtData) throws InvalidNBTData;
}