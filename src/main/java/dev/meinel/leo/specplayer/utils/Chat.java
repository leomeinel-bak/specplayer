/*
 * File: Chat.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.specplayer.utils;

import dev.meinel.leo.specplayer.SpecPlayer;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Chat {

    private static final SpecPlayer main = JavaPlugin.getPlugin(SpecPlayer.class);

    private Chat() {
        throw new IllegalStateException("Utility class");
    }

    public static void sendMessage(@NotNull CommandSender player, @NotNull String message) {
        player.sendMessage(replaceColors(Objects.requireNonNull(main.getMessages()
                .getMessagesConf()
                .getString(message))));
    }

    public static String replaceColors(@NotNull String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}