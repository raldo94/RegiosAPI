package net.jzx7.regiosapi.worlds;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public interface RegiosWorld {

	public World getWorld();
	
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

	public boolean canCreatureSpawn(EntityType entityType);

	public void addCreatureSpawn(EntityType ct);
	
	public boolean canBypassWorldChecks(Player p);
}