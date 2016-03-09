package net.jzx7.regiosapi.regions;

import net.jzx7.regiosapi.location.RegiosPoint;
import net.jzx7.regiosapi.worlds.RegiosWorld;

public interface CuboidRegion extends Region {
	
	RegiosPoint getL1();

	RegiosPoint getL2();
	
	void setL1(RegiosPoint l1);

	void setL1(RegiosWorld w, float x, float y, float z);

	void setL2(RegiosPoint l2);

	void setL2(RegiosWorld w, float x, float y, float z);
	
}