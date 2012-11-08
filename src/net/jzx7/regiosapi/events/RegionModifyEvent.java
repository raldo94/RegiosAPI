package net.jzx7.regiosapi.events;

import net.jzx7.regiosapi.regions.Region;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RegionModifyEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Region region;

    public RegionModifyEvent(String name) {
    }
    
    public Region getRegion(){
    	return this.region;
    }

    public void setProperties(Region genericRegion) {
        this.region = genericRegion;
    }

    @Override
	public HandlerList getHandlers() {
        return handlers;
    }
     
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
