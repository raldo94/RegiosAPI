package net.jzx7.regiosapi.regions;

import net.jzx7.regiosapi.location.RegiosPoint;
import net.jzx7.regiosapi.worlds.RegiosWorld;

public interface CuboidRegion extends Region {
	
	public RegiosPoint getL1();

	public RegiosPoint getL2();
	
	public void setL1(RegiosPoint l1);

	public void setL1(RegiosWorld w, float x, float y, float z);

	public void setL2(RegiosPoint l2);

	public void setL2(RegiosWorld w, float x, float y, float z);
	
}