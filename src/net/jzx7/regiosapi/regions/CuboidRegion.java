package net.jzx7.regiosapi.regions;

import org.bukkit.Location;
import org.bukkit.World;

public interface CuboidRegion extends Region {
	
	public Location getL1();

	public Location getL2();
	
	public void setL1(Location l1);

	public void setL1(World w, double x, double y, double z);

	public void setL2(Location l2);

	public void setL2(World w, double x, double y, double z);
	
}