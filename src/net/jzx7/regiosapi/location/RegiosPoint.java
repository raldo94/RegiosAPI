package net.jzx7.regiosapi.location;

import net.jzx7.regiosapi.worlds.RegiosWorld;

public class RegiosPoint {
	
	private double x,y,z;
	
	private float yaw, pitch;
	
	private RegiosWorld rWorld;
	
	public RegiosPoint(RegiosWorld rWorld, double x, double y, double z) {
		this(rWorld, x, y, z, 0, 0);
	}
	
	public RegiosPoint(RegiosWorld rWorld, float x, float y, float z) {
		this(rWorld, x, y, z, 0, 0);
	}
	
	public RegiosPoint(RegiosWorld rWorld, int x, int y, int z) {
		this(rWorld, x, y, z, 0, 0);
	}
	
	public RegiosPoint(double x, double y, double z) {
		this(x, y, z, 0, 0);
	}
	
	public RegiosPoint(float x, float y, float z) {
		this(x, y, z, 0, 0);
	}
	
	public RegiosPoint(int x, int y, int z) {
		this(x, y, z, 0, 0);
	}
	
	public RegiosPoint(RegiosWorld rWorld, double x, double y, double z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rWorld = rWorld;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public RegiosPoint(RegiosWorld rWorld, float x, float y, float z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rWorld = rWorld;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public RegiosPoint(RegiosWorld rWorld, int x, int y, int z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rWorld = rWorld;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public RegiosPoint(double x, double y, double z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rWorld = null;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public RegiosPoint(float x, float y, float z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rWorld = null;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public RegiosPoint(int x, int y, int z, float yaw, float pitch) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rWorld = null;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public RegiosWorld getRegiosWorld() {
		return rWorld;
	}

	public float getYaw() {
		return yaw;
	}
	
	public float getPitch() {
		return pitch;
	}
	
	public void setX(double x) {
		this.x = x;
		
	}

	public void setY(double y) {
		this.y = y;
		
	}

	public void setZ(double z) {
		this.z = z;
		
	}

	public void setX(int x) {
		this.x = x;
		
	}

	public void setY(int y) {
		this.y = y;
		
	}

	public void setZ(int z) {
		this.z = z;
		
	}
	
	public void setYaw(float yaw) {
		this.yaw = yaw;
	}
	
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public void setRegiosWorld(RegiosWorld rWorld) {
		this.rWorld = rWorld;
		
	}

	public int getBlockX() {
		return (int) Math.round(x);
	}

	public int getBlockY() {
		return (int) Math.round(y);
	}

	public int getBlockZ() {
		return (int) Math.round(z);
	}

	public RegiosPoint add(double x, double y, double z) {
		return new RegiosPoint(this.getRegiosWorld(), this.x + x, this.y + y, this.z + z);
	}

	public RegiosPoint add(RegiosPoint pt) {
		return new RegiosPoint(this.getRegiosWorld(), this.x + pt.getX(), this.y + pt.getY(), this.z + pt.getZ());
	}

	public RegiosPoint subtract(double x, double y, double z) {
		return new RegiosPoint(this.getRegiosWorld(), this.x - x, this.y - y, this.z - z);
	}

	public RegiosPoint subtract(RegiosPoint pt) {
		return new RegiosPoint(this.getRegiosWorld(), this.x - pt.getX(), this.y - pt.getY(), this.z - pt.getZ());
	}

	public RegiosPoint multiply(double a) {
		return new RegiosPoint(this.getRegiosWorld(), this.x * a, this.y * a, this.z * a);
	}
	
	public RegiosPoint getDirection() {
        RegiosPoint vector = new RegiosPoint(0,0,0);

        double rotX = this.getYaw();
        double rotY = this.getPitch();

        vector.setY(-Math.sin(Math.toRadians(rotY)));

        double h = Math.cos(Math.toRadians(rotY));

        vector.setX(-h * Math.sin(Math.toRadians(rotX)));
        vector.setZ(h * Math.cos(Math.toRadians(rotX)));

        return vector;
    }
}