/*
 * File: SpecPlayerCmd.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.specplayer.commands;

import dev.meinel.leo.specplayer.utils.commands.Cmd;
import dev.meinel.leo.specplayer.utils.commands.CmdSpec;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SpecPlayerCmd
        implements CommandExecutor {

    private static final Map<UUID, Location> lastLocation = new HashMap<>();
    private static final Map<UUID, UUID> lastPlayer = new HashMap<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
            @NotNull String[] args) {
        if (Cmd.isArgsLengthGreaterThan(sender, args, 1)) {
            return false;
        }
        if (args.length == 0) {
            doBack(sender);
            return true;
        }
        doSpec(sender, args);
        return true;
    }

    private void doBack(@NotNull CommandSender sender) {
        if (CmdSpec.isInvalidCmd(sender, "specplayer.spectate", lastLocation)) {
            return;
        }
        Player senderPlayer = (Player) sender;
        UUID senderUUID = senderPlayer.getUniqueId();
        senderPlayer.setGameMode(GameMode.SURVIVAL);
        if (lastLocation.containsKey(senderUUID)) {
            senderPlayer.teleport(lastLocation.get(senderUUID));
            senderPlayer.setAllowFlight(true);
            senderPlayer.setFlying(true);
            lastLocation.remove(senderUUID);
            lastPlayer.remove(senderUUID);
        }
    }

    private void doSpec(@NotNull CommandSender sender, @NotNull String[] args) {
        Player player = Bukkit.getPlayer(args[0]);
        if (CmdSpec.isInvalidCmd(sender, player, "specplayer.spectate")) {
            return;
        }
        Player senderPlayer = (Player) sender;
        UUID senderUUID = senderPlayer.getUniqueId();
        assert player != null;
        UUID playerUUId = player.getUniqueId();
        if (lastPlayer.get(senderUUID) == playerUUId) {
            doBack(sender);
        }
        lastLocation.computeIfAbsent(senderUUID, key -> senderPlayer.getLocation());
        lastPlayer.put(senderUUID, playerUUId);
        senderPlayer.setGameMode(GameMode.SPECTATOR);
        senderPlayer.teleport(player.getLocation());
    }
}
