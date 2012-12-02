package net.jzx7.regiosapi.regions;

import java.awt.Polygon;

public interface PolyRegion extends Region {
	
	public void addPoint(int x, int z);
	
	public Polygon get2DPolygon();
	
	public void set2DPolygon(Polygon polygon);
	
	public double getMinY();
	
	public double getMaxY();
	
	public void setMinY(double minY);
	
	public void setMaxY(double maxY);
	
	public boolean insideBounds(int x, int z);
	
	public boolean inside(int x, int z);
	
	public boolean insideBounds(double x, double z);
	
	public boolean inside(double x, double z);
}