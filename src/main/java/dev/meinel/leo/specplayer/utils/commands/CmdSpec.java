/*
 * File: CmdSpec.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2023 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.specplayer.utils.commands;

import dev.meinel.leo.specplayer.utils.Chat;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.UUID;

public class CmdSpec {

    private CmdSpec() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isInvalidCmd(@NotNull CommandSender sender, Player player,
            @NotNull String perm) {
        return Cmd.isInvalidSender(sender) || Cmd.isNotPermitted(sender, perm)
                || Cmd.isInvalidPlayer(sender, player);
    }

    public static boolean isInvalidCmd(@NotNull CommandSender sender, @NotNull String perm,
            Map<UUID, Location> lastLocation) {
        return Cmd.isInvalidSender(sender) || Cmd.isNotPermitted(sender, perm)
                || hasNoLastLocation(sender, lastLocation);
    }

    private static boolean hasNoLastLocation(@NotNull CommandSender sender,
            Map<UUID, Location> lastLocation) {
        Player senderPlayer = (Player) sender;
        if (!lastLocation.containsKey(senderPlayer.getUniqueId())) {
            Chat.sendMessage(sender, "cmd");
            return true;
        }
        Chat.sendMessage(sender, "back");
        return false;
    }
}
