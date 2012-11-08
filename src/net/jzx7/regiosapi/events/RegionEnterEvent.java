package net.jzx7.regiosapi.events;

import net.jzx7.regiosapi.regions.Region;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RegionEnterEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private Region region;
	private Player player;

    public RegionEnterEvent(String name) {
        super();
    }
    
    public Region getRegion(){
    	return this.region;
    }
    
    public Player getPlayer(){
    	return this.player;
    }

    public void setProperties(Player player, Region region) {
    	this.player = player;
        this.region = region;
    }

    @Override
	public HandlerList getHandlers() {
        return handlers;
    }
     
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
