package net.jzx7.regiosapi.inventory;

import java.util.HashMap;
import java.util.Map;

public class RegiosItem {
	
	private int id;
    private short data;
    private final Map<Integer, Integer> enchantments = new HashMap<Integer, Integer>();

    public RegiosItem(int id) {
        this.id = id;
        this.data = 0;
    }

    public RegiosItem(int id, short data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getData() {
        return data;
    }

    public void setData(short data) {
        this.data = data;
    }

    public Map<Integer, Integer> getEnchantments() {
        return enchantments;
    }
}