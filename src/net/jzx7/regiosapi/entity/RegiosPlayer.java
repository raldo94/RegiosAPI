package net.jzx7.regiosapi.entity;

import net.jzx7.regiosapi.inventory.RegiosItemStack;
import net.jzx7.regiosapi.location.RegiosPoint;
import net.jzx7.regiosapi.worlds.RegiosWorld;

public interface RegiosPlayer {
	
	RegiosWorld getRegiosWorld();
	
	void sendMessage(String str);
	
	RegiosPoint getPoint();
	
	String getName();
	
	void teleport(RegiosPoint l);
	
	RegiosItemStack getItemInHand();
	
	void setItemInHand(RegiosItemStack ris);
	
	boolean hasPermission(String node);
	
	double getHealth();
	
	void setHealth(double h);
	
	void damage(double d);
	
	int getGameMode();
	
	void setGameMode(int gm);
	
	boolean performCommand(String cmd);
	
	void closeInventory();
	
	void setVelocity(RegiosPoint l);
	
	RegiosItemStack[] getInventoryContents();
	
	void setInventoryContents(RegiosItemStack[] ris);
	
	RegiosItemStack[] getArmorContents();
	
	void setArmorContents(RegiosItemStack[] ris);
	
	void addItem(RegiosItemStack ris);
	
	void addItem(int id, int amount);
	
	boolean inventoryContains(RegiosItemStack ris);
	
	void clearInventory();
	
	boolean isOp();
}