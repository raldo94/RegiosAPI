package net.jzx7.regiosapi.events;

import net.jzx7.regiosapi.regions.Region;

import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RegionLightningStrikeEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Region region;
	private Location location;

    public RegionLightningStrikeEvent(String name) {
        super();
    }
    
    public Region getRegion(){
    	return this.region;
    }
    
    public Location getLocation(){
    	return this.location;
    }

    public void setProperties(Location location, Region r) {
    	this.location = location;
        this.region = r;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
     
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
