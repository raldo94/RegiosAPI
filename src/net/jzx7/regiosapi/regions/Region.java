package net.jzx7.regiosapi.regions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import net.jzx7.regiosapi.data.MODE;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public interface Region {

	public void setBiome(Biome biome, Player p);
	
	public void addException(String exception);

	public void addExceptionNode(String node);

	public void addItemException(int id);

	public void addPlayer(Player p);

	public boolean areChestsLocked();

	public boolean areDispensersLocked();

	public boolean areDoorsLocked();

	public boolean canBypassProtection(Player p);

	public boolean canModify(Player p);

	public boolean canBuild(Player p);

	public boolean canPlaceItem(Player p, Material m);

	public boolean canEnter(Player p);

	public boolean canExit(Player p);

	public GameMode getGameMode();

	public void setGameMode(GameMode gm);

	public void setChangeGameMode(boolean val);

	public boolean isChangeGameMode();

	public void setBlockEndermanMod(boolean val);

	public boolean isBlockEndermanMod();

	public boolean canMobsSpawn();

	public boolean canMonstersSpawn();

	public HashMap<String, Boolean> getAuthentication();

	public boolean getAuthentication(String password, Player p);

	public File getBackupsDirectory();

	public String[] getCommandSet();

	public File getConfigFile();

	public String[] getCustomSoundUrl();

	public File getDirectory();

	public File getExceptionDirectory();

	public ArrayList<String> getExceptionNodes();

	public ArrayList<String> getExceptions();

	public int getHealthRegen();

	public HashMap<String, PlayerInventory> getInventoryCache();

	public PlayerInventory getInventoryCache(Player p);

	public MODE getItemMode();

	public ArrayList<Integer> getItems();

	public String getLeaveMessage();

	public HashMap<String, Boolean> getLeaveMessageSent();

	public File getLogFile();

	public int getLSPS();

	public String getName();

	public ArrayList<String> getNodes();

	public String getOwner();

	public String getPassword();

	public String[] getPermAddNodes();

	public String[] getPermRemoveNodes();

	public String[] getPermAddGroups();

	public String[] getPermRemoveGroups();

	public String[] getTempAddGroups();

	public String[] getTempRemoveGroups();

	public void setPermAddGroups(String[] val);

	public void setPermRemoveGroups(String[] val);

	public void setTempAddGroups(String[] val);

	public void setTempRemoveGroups(String[] val);

	public int getPlayerCap();

	public ArrayList<String> getPlayersInRegion();

	public String getPreventEntryMessage();

	public MODE getPreventEntryMode();

	public String getPreventExitMessage();

	public MODE getPreventExitMode();

	public String getProtectionMessage();

	public MODE getProtectionMode();

	public File getRawConfigFile();

	public int getSalePrice();

	public Material getSpoutLeaveMaterial();

	public String getSpoutLeaveMessage();

	public String getSpoutTexturePack();

	public Material getSpoutWelcomeMaterial();

	public String getSpoutWelcomeMessage();

	public String[] getSubOwners();

	public String[] getTempNodesCacheAdd();

	public String[] getTempNodesCacheRem();

	public HashMap<String, Long> getTimeStamps();

	public double getVelocityWarp();

	public Location getWarp();

	public String getWelcomeMessage();

	public HashMap<String, Boolean> getWelcomeMessageSent();

	public World getWorld();

	public boolean is_protectionBreak();

	public boolean is_protectionPlace();

	public boolean isAuthenticated(Player p);

	public boolean isBlockForm();

	public boolean isFireProtection();

	public boolean isFireSpread();

	public boolean isForceCommand();

	public boolean isForSale();

	public boolean isHealthEnabled();

	public boolean isPasswordEnabled();

	public boolean isPermWipeOnEnter();

	public boolean isPermWipeOnExit();

	public boolean isPlayCustomSoundUrl();

	public boolean isPlayerInRegion(Player p);

	public boolean isPreventEntry();

	public boolean isPreventExit();

	public boolean isPreventInteraction();

	public boolean isProtected();

	public boolean isPvp();

	public boolean isRegionFull(Player p);

	public boolean isShowLeaveMessage();

	public boolean isShowPreventEntryMessage();

	public boolean isShowPreventExitMessage();

	public boolean isShowProtectionMessage();

	public boolean isShowPvpWarning();

	public boolean isShowWelcomeMessage();

	public boolean isSpoutLeaveEnabled();

	public boolean isSpoutWelcomeEnabled();

	public boolean isExplosionsEnabled();

	public boolean isUseSpoutTexturePack();

	public boolean isWipeAndCacheOnEnter();

	public boolean isWipeAndCacheOnExit();

	public String liveFormat(String original, Player p);

	public void removeException(String exception);

	public void removeExceptionNode(String node);

	public void removeItemException(int id);

	public void removePlayer(Player p);

	public void resetAuthentication(Player p);

	public void sendBuildMessage(Player p);

	public void sendLeaveMessage(Player p);

	public void sendPreventEntryMessage(Player p);

	public void sendPreventExitMessage(Player p);

	public void sendWelcomeMessage(Player p);

	public void set_protection(boolean _protection);

	public void set_protectionBreak(boolean _protectionBreak);

	public void set_protectionPlace(boolean _protectionPlace);

	public void setAuthentication(HashMap<String, Boolean> authentication);

	public void setBlockForm(boolean blockForm);

	public void setChestsLocked(boolean chestsLocked);

	public void setCommandSet(String[] commandSet);

	public void setCustomSoundUrl(String[] customSoundUrl);

	public void setDoorsLocked(boolean doorsLocked);

	public void setExceptions(ArrayList<String> exceptions);

	public void setFireProtection(boolean fireProtection);

	public void setFireSpread(boolean fireSpread);

	public void setForceCommand(boolean forceCommand);

	public void setForSale(boolean forSale);

	public void setHealthEnabled(boolean healthEnabled);

	public void setHealthRegen(int healthRegen);

	public void setInventoryCache(HashMap<String, PlayerInventory> inventoryCache);

	public void setItemMode(MODE itemMode);

	public void setItems(ArrayList<Integer> items);

	public void setLeaveMessage(String leaveMessage);

	public void setLeaveMessageSent(HashMap<String, Boolean> leaveMessageSent);

	public void setLSPS(int lSPS);

	public void setMobSpawns(boolean mobSpawns);

	public void setMonsterSpawns(boolean monsterSpawns);

	public void setName(String name);

	public void setNodes(ArrayList<String> nodes);

	public void setOwner(String owner);

	public void setPassword(String password);

	public void setPasswordEnabled(boolean passwordEnabled);

	public void setPermanentNodesCacheAdd(String[] permanentNodesCacheAdd);

	public void setPermanentNodesCacheRemove(String[] permanentNodesCacheRemove);

	public void setPermWipeOnEnter(boolean permWipeOnEnter);

	public void setPermWipeOnExit(boolean permWipeOnExit);

	public void setPlayCustomSoundUrl(boolean playCustomSoundUrl);

	public void setPlayerCap(int playerCap);

	public void setPlayersInRegion(ArrayList<String> playersInRegion);

	public void setPreventEntry(boolean preventEntry);

	public void setPreventEntryMessage(String preventEntryMessage);

	public void setPreventEntryMode(MODE preventEntryMode);

	public void setPreventExit(boolean preventExit);

	public void setPreventExitMessage(String preventExitMessage);

	public void setPreventExitMode(MODE preventExitMode);

	public void setPreventInteraction(boolean preventInteraction);

	public void setProtectionMessage(String protectionMessage);

	public void setProtectionMode(MODE protectionMode);

	public void setPvp(boolean pvp);

	public void setSalePrice(int salePrice);

	public void setShowLeaveMessage(boolean showLeaveMessage);

	public void setShowPreventEntryMessage(boolean showPreventEntryMessage);

	public void setShowPreventExitMessage(boolean showPreventExitMessage);

	public void setShowProtectionMessage(boolean showProtectionMessage);

	public void setShowPvpWarning(boolean showPvpWarning);

	public void setShowWelcomeMessage(boolean showWelcomeMessage);

	public void setSpoutEntryMaterial(Material spoutEntryMaterial);

	public void setSpoutEntryMessage(String spoutEntryMessage);

	public void setSpoutExitMaterial(Material spoutExitMaterial);

	public void setSpoutExitMessage(String spoutExitMessage);

	public void setSpoutLeaveEnabled(boolean spoutLeaveEnabled);

	public void setSpoutTexturePack(String spoutTexturePack);

	public void setSpoutWelcomeEnabled(boolean spoutWelcomeEnabled);

	public void setSubOwners(String[] subOwners);

	public void setTempNodesCacheAdd(String[] temporaryNodesCacheAdd);

	public void setTempNodesCacheRem(String[] temporaryNodesCacheRem);

	public void setTimestamp(Player p);

	public void setTimeStamps(HashMap<String, Long> timeStamps);

	public void setExplosionsEnabled(boolean explosionsEnabled);

	public void setUseSpoutTexturePack(boolean useSpoutTexturePack);

	public void setVelocityWarp(double velocityWarp);

	public void setWarp(Location warp);

	public void setWelcomeMessage(String welcomeMessage);

	public void setWelcomeMessageSent(HashMap<String, Boolean> welcomeMessageSent);

	public void setWipeAndCacheOnEnter(boolean wipeAndCacheOnEnter);

	public void setWipeAndCacheOnExit(boolean wipeAndCacheOnExit);

	public void setWorld(World world);

	public void setDispensersLocked(boolean dispensersLocked);

	public String colourFormat(String message);
}
