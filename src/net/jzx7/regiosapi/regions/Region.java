package net.jzx7.regiosapi.regions;

import java.util.ArrayList;
import java.util.HashMap;

import net.jzx7.regiosapi.block.RegiosBiome;
import net.jzx7.regiosapi.data.MODE;
import net.jzx7.regiosapi.entity.RegiosPlayer;
import net.jzx7.regiosapi.location.RegiosPoint;
import net.jzx7.regiosapi.worlds.RegiosWorld;

public interface Region {

	public void addException(String exception);
	
	public void addExceptionNode(String node);

	public void addItemException(int id);

	public void addPlayer(RegiosPlayer p);

	public boolean areChestsLocked();

	public boolean areDispensersLocked();

	public boolean areDoorsLocked();

	public boolean canBuild(RegiosPlayer p);

	public boolean canBypassProtection(RegiosPlayer p);

	public boolean canEnter(RegiosPlayer p);

	public boolean canExit(RegiosPlayer p);

	public boolean canMobsSpawn();

	public boolean canModify(RegiosPlayer p);

	public boolean canMonstersSpawn();

	public boolean canPlaceItem(RegiosPlayer p, int m);

	public HashMap<String, Boolean> getAuthentication();

	public boolean getAuthentication(String password, RegiosPlayer p);

	public String[] getCommandSet();

	public String[] getCustomSoundUrl();

	public ArrayList<String> getExceptionNodes();

	public ArrayList<String> getExceptions();

	public int getGameMode();

	public int getHealthRegen();

	public MODE getItemMode();

	public ArrayList<Integer> getItems();

	public String getLeaveMessage();

	public HashMap<String, Boolean> getLeaveMessageSent();

	public int getLSPS();

	public String getName();

	public ArrayList<String> getNodes();

	public String getOwner();

	public String getPassword();

	public String[] getPermAddGroups();

	public String[] getPermAddNodes();

	public String[] getPermRemoveGroups();

	public String[] getPermRemoveNodes();

	public int getPlayerCap();

	public ArrayList<String> getPlayersInRegion();

	public String getPreventEntryMessage();

	public MODE getPreventEntryMode();

	public String getPreventExitMessage();

	public MODE getPreventExitMode();

	public String getProtectionMessage();

	public MODE getProtectionMode();

	public int getSalePrice();

	public int getSpoutLeaveMaterial();

	public String getSpoutLeaveMessage();

	public String getSpoutTexturePack();

	public int getSpoutWelcomeMaterial();

	public String getSpoutWelcomeMessage();

	public String[] getSubOwners();

	public String[] getTempAddGroups();

	public String[] getTempNodesCacheAdd();

	public String[] getTempNodesCacheRem();

	public String[] getTempRemoveGroups();

	public long getTimestamp(RegiosPlayer p);

	public HashMap<String, Long> getTimeStamps();

	public double getVelocityWarp();

	public RegiosPoint getWarp();

	public String getWelcomeMessage();

	public HashMap<String, Boolean> getWelcomeMessageSent();

	public RegiosWorld getWorld();

	public boolean is_protectionBreak();

	public boolean is_protectionPlace();

	public boolean isAuthenticated(RegiosPlayer p);

	public boolean isBlockEndermanMod();

	public boolean isBlockForm();

	public boolean isChangeGameMode();

	public boolean isExplosionsEnabled();

	public boolean isFireProtection();

	public boolean isFireSpread();

	public boolean isForceCommand();

	public boolean isForSale();

	public boolean isHealthEnabled();

	public boolean isLeaveMessageSent(RegiosPlayer p);

	public boolean isPasswordEnabled();

	public boolean isPermWipeOnEnter();

	public boolean isPermWipeOnExit();

	public boolean isPlayCustomSoundUrl();

	public boolean isPlayerInRegion(RegiosPlayer p);

	public boolean isPreventEntry();

	public boolean isPreventExit();

	public boolean isPreventInteraction();

	public boolean isProtected();

	public boolean isPvp();

	public boolean isRegionFull(RegiosPlayer p);

	public boolean isShowLeaveMessage();

	public boolean isShowPreventEntryMessage();

	public boolean isShowPreventExitMessage();

	public boolean isShowProtectionMessage();

	public boolean isShowPvpWarning();

	public boolean isShowWelcomeMessage();

	public boolean isSpoutLeaveEnabled();

	public boolean isSpoutWelcomeEnabled();
	
	public boolean isUseSpoutTexturePack();

	public boolean isWelcomeMessageSent(RegiosPlayer p);

	public boolean isWipeAndCacheOnEnter();

	public boolean isWipeAndCacheOnExit();

	public void removeException(String exception);
	
	public void removeExceptionNode(String node);

	public void removeItemException(int id);

	public void removePlayer(RegiosPlayer p);

	public void resetAuthentication(RegiosPlayer p);

	public void set_protection(boolean _protection);

	public void set_protectionBreak(boolean _protectionBreak);

	public void set_protectionPlace(boolean _protectionPlace);

	public void setAuthentication(HashMap<String, Boolean> authentication);

	public void setBiome(RegiosBiome biome, RegiosPlayer p);

	public void setBlockEndermanMod(boolean val);

	public void setBlockForm(boolean blockForm);

	public void setChangeGameMode(boolean val);

	public void setChestsLocked(boolean chestsLocked);

	public void setCommandSet(String[] commandSet);

	public void setCustomSoundUrl(String[] customSoundUrl);

	public void setDispensersLocked(boolean dispensersLocked);

	public void setDoorsLocked(boolean doorsLocked);

	public void setExceptions(ArrayList<String> exceptions);

	public void setExplosionsEnabled(boolean explosionsEnabled);

	public void setFireProtection(boolean fireProtection);

	public void setFireSpread(boolean fireSpread);

	public void setForceCommand(boolean forceCommand);

	public void setForSale(boolean forSale);

	public void setGameMode(int gm);

	public void setHealthEnabled(boolean healthEnabled);

	public void setHealthRegen(int healthRegen);

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

	public void setPermAddGroups(String[] val);

	public void setPermanentNodesCacheAdd(String[] permanentNodesCacheAdd);

	public void setPermanentNodesCacheRemove(String[] permanentNodesCacheRemove);

	public void setPermRemoveGroups(String[] val);

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

	public void setSpoutEntryMaterial(int spoutEntryMaterial);

	public void setSpoutEntryMessage(String spoutEntryMessage);

	public void setSpoutExitMaterial(int spoutLeaveMaterial);

	public void setSpoutExitMessage(String spoutExitMessage);

	public void setSpoutLeaveEnabled(boolean spoutLeaveEnabled);

	public void setSpoutTexturePack(String spoutTexturePack);

	public void setSpoutWelcomeEnabled(boolean spoutWelcomeEnabled);

	public void setSubOwners(String[] subOwners);

	public void setTempAddGroups(String[] val);

	public void setTempNodesCacheAdd(String[] temporaryNodesCacheAdd);
	
	public void setTempNodesCacheRem(String[] temporaryNodesCacheRem);
	
	public void setTempRemoveGroups(String[] val);

	public void setTimestamp(RegiosPlayer p);

	public void setTimeStamps(HashMap<String, Long> timeStamps);

	public void setUseSpoutTexturePack(boolean useSpoutTexturePack);

	public void setVelocityWarp(double velocityWarp);

	public void setWarp(RegiosPoint warp);

	public void setWelcomeMessage(String welcomeMessage);

	public void setWelcomeMessageSent(HashMap<String, Boolean> welcomeMessageSent);

	public void setWipeAndCacheOnEnter(boolean wipeAndCacheOnEnter);

	public void setWipeAndCacheOnExit(boolean wipeAndCacheOnExit);

	public void setWorld(RegiosWorld world);
	
}
