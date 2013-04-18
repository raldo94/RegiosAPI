package net.jzx7.regiosapi.block;

import net.jzx7.regiosapi.location.RegiosPoint;

public class RegiosBlock {
	
	private int id;
	private byte data;
	private RegiosPoint regiosPoint;
	
	public RegiosBlock(int id) {
		this.setId(id);
		this.setData((byte) 0);
	}
	
	public RegiosBlock(int id, byte data) {
		this.setId(id);
		this.setData(data);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getData() {
		return data;
	}

	public void setData(byte data) {
		this.data = data;
	}
	
	public RegiosPoint getPoint() {
		return regiosPoint;
	}
}