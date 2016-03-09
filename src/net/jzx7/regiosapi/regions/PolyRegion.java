package net.jzx7.regiosapi.regions;

import java.awt.Polygon;

public interface PolyRegion extends Region {
	
	void addPoint(int x, int z);
	
	Polygon get2DPolygon();
	
	void set2DPolygon(Polygon polygon);
	
	double getMinY();
	
	double getMaxY();
	
	void setMinY(double minY);
	
	void setMaxY(double maxY);
	
	boolean insideBounds(int x, int z);
	
	boolean inside(int x, int z);
	
	boolean insideBounds(double x, double z);
	
	boolean inside(double x, double z);
}