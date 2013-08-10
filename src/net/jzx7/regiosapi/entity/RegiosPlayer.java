package net.jzx7.regiosapi.entity;

import net.jzx7.regiosapi.inventory.RegiosItemStack;
import net.jzx7.regiosapi.location.RegiosPoint;
import net.jzx7.regiosapi.worlds.RegiosWorld;

public interface RegiosPlayer {
	
	public RegiosWorld getRegiosWorld();
	
	public void sendMessage(String str);
	
	public RegiosPoint getPoint();
	
	public String getName();
	
	public void teleport(RegiosPoint l);
	
	public RegiosItemStack getItemInHand();
	
	public void setItemInHand(RegiosItemStack ris);
	
	public boolean hasPermission(String node);
	
	public double getHealth();
	
	public void setHealth(double h);
	
	public void damage(double d);
	
	public int getGameMode();
	
	public void setGameMode(int gm);
	
	public boolean performCommand(String cmd);
	
	public void closeInventory();
	
	public void setVelocity(RegiosPoint l);
	
	public RegiosItemStack[] getInventoryContents();
	
	public void setInventoryContents(RegiosItemStack[] ris);
	
	public RegiosItemStack[] getArmorContents();
	
	public void setArmorContents(RegiosItemStack[] ris);
	
	public void addItem(RegiosItemStack ris);
	
	public void addItem(int id, int amount);
	
	public boolean inventoryContains(RegiosItemStack ris);
	
	public void clearInventory();
	
	public boolean isOp();
}