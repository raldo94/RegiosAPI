package net.jzx7.regiosapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import net.jzx7.regiosapi.exceptions.FileExistanceException;
import net.jzx7.regiosapi.exceptions.InvalidNBTFormat;
import net.jzx7.regiosapi.exceptions.RegionExistanceException;
import net.jzx7.regiosapi.regions.Region;
import net.jzx7.regiosapi.worlds.RegiosWorld;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public interface RegiosAPI {

	/**
	 * Gets the version number of Regios
	 * 
	 * @return version number
	 */
	String getRegiosVersion();

	/**
	 * Get a list of all the Regions.
	 * 
	 * @return List of Regions.
	 */
	ArrayList<Region> getRegions();

	/**
	 * Get a list of all the Regions in specified world.
	 * 
	 * @param w World
	 * @return List of Regions.
	 */
	ArrayList<Region> getRegions(World w);

	/**
	 * Get a list of all the Regions in specified location.
	 * 
	 * @param l Location
	 * @return List of Regions.
	 */
	ArrayList<Region> getRegions(Location l);

	/**
	 * Get the region a player is in.
	 * 
	 * @param p Player.
	 * @return Returns the region that the specified player is in. Will return
	 *         null if the player is not in a region.
	 */
	Region getRegion(Player p);

	/**
	 * Get the region a location is in.
	 * 
	 * @param l Location.
	 * @return Returns the region that the specified location is in. Will return
	 *         null if the location is not in a region.
	 */
	Region getRegion(Location l);

	/**
	 * Get a region by it's name.
	 * 
	 * @param region The Region name.
	 * @return Returns the Region object with the corresponding name. Will
	 *         return null if no region with that name exists.
	 */
	Region getRegion(String name);

	/**
	 * Get the number of owned regions for a player
	 * 
	 * @param name String
	 * @return
	 */
	int getOwnedRegions(String name);

	/**
	 * Check whether a player is in a region.
	 * 
	 * @param p Player.
	 * @return Whether the player is in a region or not.
	 */
	boolean isInRegion(Player p);

	/**
	 * Check whether a location is in a region.
	 * 
	 * @param l Location.
	 * @return Whether the location is in a region or not.
	 */
	boolean isInRegion(Location l);

	/**
	 * Get collection of all the RegiosWorlds
	 * 
	 * @return Collection of RegiosWorlds
	 **/
	Collection<RegiosWorld> getRegiosWorlds();

	/**
	 * Gets the RegiosWorld from the World
	 * 
	 * @param world World
	 * @return RegiosWorld
	 */
	RegiosWorld getRegiosWorld(World world);

	/**
	 * Get the RegiosWorld from the world UUID
	 * 
	 * @param id UUID
	 * @return RegiosWorld
	 */
	RegiosWorld getRegiosWorld(UUID id);

	/**
	 * Check if the player is using Spoutcraft.
	 * 
	 * @param p
	 *            Player
	 * @return Whether the player is running the Spoutcraft launcher.
	 */
	boolean isSpoutEnabled(Player p);

	/**
	 * Check if Spout is installed on the server.
	 * 
	 * @return Whether Regios is running with Spout support.
	 */
	boolean isSpoutEnabled();

	/**
	 * Create a backup of a Region with the specified Name.
	 * 
	 * @param r
	 *            Region to create a backup of.
	 * @param backupName
	 *            Backup name.
	 */
	void backupRegion(Region r, String backupName, Player p);

	/**
	 * Restore a Region to its previous state when backed up.
	 * 
	 * @param r
	 *            Region.
	 * @param backupName
	 *            Backup Name.
	 * @param p
	 *            Player
	 * @throws RegionExistanceException
	 * @throws FileExistanceException
	 * @throws InvalidNBTFormatException
	 */
	boolean loadBackup(Region r, String backupName, Player p) throws RegionExistanceException, FileExistanceException, InvalidNBTFormat;

	/**
	 * Create a blueprint file.
	 * 
	 * @param name
	 *            Name of the file.
	 * @param l1
	 *            Point 1.
	 * @param l2
	 *            Point 2.
	 * @param p
	 *            Player
	 */
	void saveBlueprint(String name, Location l1, Location l2, Player p);

	/**
	 * Loads a blueprint.
	 * 
	 * @param name
	 *            The name of the blueprint.
	 * @param p
	 *            Player
	 * @param pasteLocation
	 *            The location to begin the paste.
	 */
	boolean loadBlueprint(String name, Player p, Location pasteLocation);
	
	/**
	 * Create a blueprint file.
	 * 
	 * @param name
	 *            Name of the file.
	 * @param l1
	 *            Point 1.
	 * @param l2
	 *            Point 2.
	 * @param p
	 *            Player
	 */
	void saveSchematic(String name, Location l1, Location l2, Player p);

	/**
	 * Loads a blueprint.
	 * 
	 * @param name
	 *            The name of the blueprint.
	 * @param p
	 *            Player
	 * @param pasteLocation
	 *            The location to begin the paste.
	 */
	boolean loadSchematic(String name, Player p, Location pasteLocation);
}