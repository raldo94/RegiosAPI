package net.jzx7.regiosapi.regions;

import java.util.ArrayList;
import java.util.HashMap;

import net.jzx7.regiosapi.block.RegiosBiome;
import net.jzx7.regiosapi.data.MODE;
import net.jzx7.regiosapi.entity.RegiosPlayer;
import net.jzx7.regiosapi.location.RegiosPoint;
import net.jzx7.regiosapi.worlds.RegiosWorld;

public interface Region {

	void addException(String exception);
	
	void addExceptionNode(String node);

	void addItemException(int id);

	void addPlayer(RegiosPlayer p);

	boolean areChestsLocked();

	boolean areDispensersLocked();

	boolean areDoorsLocked();

	boolean canBuild(RegiosPlayer p);

	boolean canBypassProtection(RegiosPlayer p);

	boolean canEnter(RegiosPlayer p);

	boolean canExit(RegiosPlayer p);

	boolean canMobsSpawn();

	boolean canModify(RegiosPlayer p);

	boolean canMonstersSpawn();

	boolean canPlaceItem(RegiosPlayer p, int m);

	HashMap<String, Boolean> getAuthentication();

	boolean getAuthentication(String password, RegiosPlayer p);

	String[] getCommandSet();

	String[] getCustomSoundUrl();

	ArrayList<String> getExceptionNodes();

	ArrayList<String> getExceptions();

	int getGameMode();

	int getHealthRegen();

	MODE getItemMode();

	ArrayList<Integer> getItems();

	String getLeaveMessage();

	HashMap<String, Boolean> getLeaveMessageSent();

	int getLSPS();

	String getName();

	ArrayList<String> getNodes();

	String getOwner();

	String getPassword();

	String[] getPermAddGroups();

	String[] getPermAddNodes();

	String[] getPermRemoveGroups();

	String[] getPermRemoveNodes();

	int getPlayerCap();

	ArrayList<String> getPlayersInRegion();

	String getPreventEntryMessage();

	MODE getPreventEntryMode();

	String getPreventExitMessage();

	MODE getPreventExitMode();

	String getProtectionMessage();

	MODE getProtectionMode();

	int getSalePrice();

	int getSpoutLeaveMaterial();

	String getSpoutLeaveMessage();

	String getSpoutTexturePack();

	int getSpoutWelcomeMaterial();

	String getSpoutWelcomeMessage();

	String[] getSubOwners();

	String[] getTempAddGroups();

	String[] getTempNodesCacheAdd();

	String[] getTempNodesCacheRem();

	String[] getTempRemoveGroups();

	long getTimestamp(RegiosPlayer p);

	HashMap<String, Long> getTimeStamps();

	double getVelocityWarp();

	RegiosPoint getWarp();

	String getWelcomeMessage();

	HashMap<String, Boolean> getWelcomeMessageSent();

	RegiosWorld getWorld();

	boolean is_protectionBreak();

	boolean is_protectionPlace();

	boolean isAuthenticated(RegiosPlayer p);

	boolean isBlockEndermanMod();

	boolean isBlockForm();

	boolean isChangeGameMode();

	boolean isExplosionsEnabled();

	boolean isFireProtection();

	boolean isFireSpread();

	boolean isForceCommand();

	boolean isForSale();

	boolean isHealthEnabled();

	boolean isLeaveMessageSent(RegiosPlayer p);

	boolean isPasswordEnabled();

	boolean isPermWipeOnEnter();

	boolean isPermWipeOnExit();

	boolean isPlayCustomSoundUrl();

	boolean isPlayerInRegion(RegiosPlayer p);

	boolean isPreventEntry();

	boolean isPreventExit();

	boolean isPreventInteraction();

	boolean isProtected();

	boolean isPvp();

	boolean isRegionFull(RegiosPlayer p);

	boolean isShowLeaveMessage();

	boolean isShowPreventEntryMessage();

	boolean isShowPreventExitMessage();

	boolean isShowProtectionMessage();

	boolean isShowPvpWarning();

	boolean isShowWelcomeMessage();

	boolean isSpoutLeaveEnabled();

	boolean isSpoutWelcomeEnabled();
	
	boolean isUseSpoutTexturePack();

	boolean isWelcomeMessageSent(RegiosPlayer p);

	boolean isWipeAndCacheOnEnter();

	boolean isWipeAndCacheOnExit();

	void removeException(String exception);
	
	void removeExceptionNode(String node);

	void removeItemException(int id);

	void removePlayer(RegiosPlayer p);

	void resetAuthentication(RegiosPlayer p);

	void set_protection(boolean _protection);

	void set_protectionBreak(boolean _protectionBreak);

	void set_protectionPlace(boolean _protectionPlace);

	void setAuthentication(HashMap<String, Boolean> authentication);

	void setBiome(RegiosBiome biome, RegiosPlayer p);

	void setBlockEndermanMod(boolean val);

	void setBlockForm(boolean blockForm);

	void setChangeGameMode(boolean val);

	void setChestsLocked(boolean chestsLocked);

	void setCommandSet(String[] commandSet);

	void setCustomSoundUrl(String[] customSoundUrl);

	void setDispensersLocked(boolean dispensersLocked);

	void setDoorsLocked(boolean doorsLocked);

	void setExceptions(ArrayList<String> exceptions);

	void setExplosionsEnabled(boolean explosionsEnabled);

	void setFireProtection(boolean fireProtection);

	void setFireSpread(boolean fireSpread);

	void setForceCommand(boolean forceCommand);

	void setForSale(boolean forSale);

	void setGameMode(int gm);

	void setHealthEnabled(boolean healthEnabled);

	void setHealthRegen(int healthRegen);

	void setItemMode(MODE itemMode);

	void setItems(ArrayList<Integer> items);

	void setLeaveMessage(String leaveMessage);

	void setLeaveMessageSent(HashMap<String, Boolean> leaveMessageSent);

	void setLSPS(int lSPS);

	void setMobSpawns(boolean mobSpawns);

	void setMonsterSpawns(boolean monsterSpawns);

	void setName(String name);

	void setNodes(ArrayList<String> nodes);

	void setOwner(String owner);

	void setPassword(String password);

	void setPasswordEnabled(boolean passwordEnabled);

	void setPermAddGroups(String[] val);

	void setPermanentNodesCacheAdd(String[] permanentNodesCacheAdd);

	void setPermanentNodesCacheRemove(String[] permanentNodesCacheRemove);

	void setPermRemoveGroups(String[] val);

	void setPermWipeOnEnter(boolean permWipeOnEnter);

	void setPermWipeOnExit(boolean permWipeOnExit);

	void setPlayCustomSoundUrl(boolean playCustomSoundUrl);

	void setPlayerCap(int playerCap);

	void setPlayersInRegion(ArrayList<String> playersInRegion);

	void setPreventEntry(boolean preventEntry);

	void setPreventEntryMessage(String preventEntryMessage);

	void setPreventEntryMode(MODE preventEntryMode);

	void setPreventExit(boolean preventExit);

	void setPreventExitMessage(String preventExitMessage);

	void setPreventExitMode(MODE preventExitMode);

	void setPreventInteraction(boolean preventInteraction);

	void setProtectionMessage(String protectionMessage);

	void setProtectionMode(MODE protectionMode);

	void setPvp(boolean pvp);

	void setSalePrice(int salePrice);

	void setShowLeaveMessage(boolean showLeaveMessage);

	void setShowPreventEntryMessage(boolean showPreventEntryMessage);

	void setShowPreventExitMessage(boolean showPreventExitMessage);

	void setShowProtectionMessage(boolean showProtectionMessage);

	void setShowPvpWarning(boolean showPvpWarning);

	void setShowWelcomeMessage(boolean showWelcomeMessage);

	void setSpoutEntryMaterial(int spoutEntryMaterial);

	void setSpoutEntryMessage(String spoutEntryMessage);

	void setSpoutExitMaterial(int spoutLeaveMaterial);

	void setSpoutExitMessage(String spoutExitMessage);

	void setSpoutLeaveEnabled(boolean spoutLeaveEnabled);

	void setSpoutTexturePack(String spoutTexturePack);

	void setSpoutWelcomeEnabled(boolean spoutWelcomeEnabled);

	void setSubOwners(String[] subOwners);

	void setTempAddGroups(String[] val);

	void setTempNodesCacheAdd(String[] temporaryNodesCacheAdd);
	
	void setTempNodesCacheRem(String[] temporaryNodesCacheRem);
	
	void setTempRemoveGroups(String[] val);

	void setTimestamp(RegiosPlayer p);

	void setTimeStamps(HashMap<String, Long> timeStamps);

	void setUseSpoutTexturePack(boolean useSpoutTexturePack);

	void setVelocityWarp(double velocityWarp);

	void setWarp(RegiosPoint warp);

	void setWelcomeMessage(String welcomeMessage);

	void setWelcomeMessageSent(HashMap<String, Boolean> welcomeMessageSent);

	void setWipeAndCacheOnEnter(boolean wipeAndCacheOnEnter);

	void setWipeAndCacheOnExit(boolean wipeAndCacheOnExit);

	void setWorld(RegiosWorld world);
	
}
