package com.earth2me.essentials;

import com.earth2me.essentials.api.IAsyncTeleport;
import com.earth2me.essentials.commands.IEssentialsCommand;
import net.ess3.api.ITeleport;
import net.ess3.api.MaxMoneyException;
import net.ess3.api.events.AfkStatusChangeEvent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;


public interface IUser {
    boolean isAuthorized(String node);

    boolean isAuthorized(IEssentialsCommand cmd);

    boolean isAuthorized(IEssentialsCommand cmd, String permissionPrefix);

    boolean isPermissionSet(String node);

    void healCooldown() throws Exception;

    void giveMoney(BigDecimal value) throws MaxMoneyException;

    void giveMoney(final BigDecimal value, final CommandSource initiator) throws MaxMoneyException;

    void payUser(final User reciever, final BigDecimal value) throws Exception;

    void takeMoney(BigDecimal value);

    void takeMoney(final BigDecimal value, final CommandSource initiator);

    boolean canAfford(BigDecimal value);

    Boolean canSpawnItem(final Material material);

    void setLastLocation();

    void setLogoutLocation();

    void requestTeleport(final User player, final boolean here);

    /**
     * Returns whether this user has an outstanding teleport request to deal with.
     *
     * @return whether there is a teleport request
     */
    boolean hasOutstandingTeleportRequest();

    /**
     * @deprecated This API is not asynchronous. Use {@link com.earth2me.essentials.api.IAsyncTeleport IAsyncTeleport} with {@link IUser#getAsyncTeleport()}
     */
    @Deprecated
    ITeleport getTeleport();

    IAsyncTeleport getAsyncTeleport();

    BigDecimal getMoney();

    void setMoney(final BigDecimal value) throws MaxMoneyException;

    @Deprecated
    void setAfk(final boolean set);

    void setAfk(final boolean set, final AfkStatusChangeEvent.Cause cause);

    /**
     * 'Hidden' Represents when a player is hidden from others. This status includes when the player is hidden via other
     * supported plugins. Use isVanished() if you want to check if a user is vanished by EssentialsXD
     *
     * @return If the user is hidden or not
     *
     * @see IUser#isVanished()
     */
    boolean isHidden();

    void setHidden(boolean vanish);

    boolean isGodModeEnabled();

    String getGroup();

    boolean inGroup(final String group);

    boolean canBuild();

    long getTeleportRequestTime();

    void enableInvulnerabilityAfterTeleport();

    void resetInvulnerabilityAfterTeleport();

    boolean hasInvulnerabilityAfterTeleport();

    /**
     * 'Vanished' Represents when a player is hidden from others by Essentials. This status does NOT include when the
     * player is hidden via other plugins. Use isHidden() if you want to check if a user is vanished by any supported
     * plugin.
     *
     * @return If the user is vanished or not
     *
     * @see IUser#isHidden()
     */
    boolean isVanished();

    void setVanished(boolean vanish);

    boolean isIgnoreExempt();

    void sendMessage(String message);

    /*
     * UserData
     */
    Location getHome(String name) throws Exception;

    Location getHome(Location loc) throws Exception;

    List<String> getHomes();

    void setHome(String name, Location loc);

    void delHome(String name) throws Exception;

    boolean hasHome();

    Location getLastLocation();

    Location getLogoutLocation();

    long getLastTeleportTimestamp();

    void setLastTeleportTimestamp(long time);

    String getJail();

    void setJail(String jail);

    List<String> getMails();

    void addMail(String mail);

    boolean isAfk();

    void setIgnoreMsg(boolean ignoreMsg);

    boolean isIgnoreMsg();

    void setConfigProperty(String node, Object object);

    Set<String> getConfigKeys();

    Map<String, Object> getConfigMap();

    Map<String, Object> getConfigMap(String node);
    
    Map<Pattern, Long> getCommandCooldowns();

    Date getCommandCooldownExpiry(String label);
    
    void addCommandCooldown(Pattern pattern, Date expiresAt, boolean save);
    
    boolean clearCommandCooldown(Pattern pattern);

    /*
     *  PlayerExtension
     */
    Player getBase();

    CommandSource getSource();

    String getName();

    String getAfkMessage();

    void setAfkMessage(final String message);
    
    long getAfkSince();
    
    boolean isAcceptingPay();
    
    void setAcceptingPay(boolean acceptingPay);
    
    boolean isPromptingPayConfirm();
    
    void setPromptingPayConfirm(boolean prompt);
    
    boolean isPromptingClearConfirm();
    
    void setPromptingClearConfirm(boolean prompt);

    boolean isLastMessageReplyRecipient();

    void setLastMessageReplyRecipient(boolean enabled);

    Map<User, BigDecimal> getConfirmingPayments();
}
