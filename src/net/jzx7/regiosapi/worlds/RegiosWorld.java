package net.jzx7.regiosapi.worlds;

import net.jzx7.regiosapi.block.RegiosBiome;
import net.jzx7.regiosapi.block.RegiosBlock;
import net.jzx7.regiosapi.entity.RegiosPlayer;
import net.jzx7.regiosapi.location.RegiosPoint;
import org.bukkit.entity.EntityType;

public interface RegiosWorld {
	
	public String getName();
	
	public boolean refreshChunk(int x, int y);
	
	public void setBiome(int x, int y, RegiosBiome biome);
	
	public int getMaxHeight();
	
	public void strikeLightning(RegiosPoint l);
	
	public RegiosBlock getBlockAt(int x, int y, int z);
	
	public RegiosBlock getBlockAt(RegiosPoint l);
	
	//Regios methods from here on out ----------------
	
	public boolean getProtection();

	public void setProtection(boolean val);
	
	public boolean getPVP();

	public void setPVP(boolean val);

	public boolean getOverridePVP();

	public void setOverridePVP(boolean val);

	public boolean getLightningEnabled();

	public void setLightningEnabled(boolean val);

	public boolean getStormsEnabled();

	public void setStormsEnabled(boolean val);

	public boolean getExplosionsEnabled();

	public void setExplosionsEnabled(boolean val);

	public boolean getFireEnabled();

	public void setFireEnabled(boolean val);

	public boolean getFireSpreadEnabled();

	public void setFireSpreadEnabled(boolean val);

	public boolean getBlockFormEnabled();

	public void setBlockFormEnabled(boolean val);

	public boolean getDragonProtectionEnabled();

	public void setDragonProtectionEnabled(boolean val);

	public boolean getEndermanProtectionEnabled();

	public void setEndermanProtectionEnabled(boolean val);
	
	public boolean getEnderDragonCreatesPortal();
	
	public void setEnderDragonCreatesPortal(boolean val);

	public boolean canCreatureSpawn(EntityType type);

	public boolean canCreatureSpawn(int entityType);

	public void addCreatureSpawn(int ct);
	
	public boolean canBypassWorldChecks(RegiosPlayer p);
}