/*
 Copyright (C) 2022  Leopold Meinel
 Visit https://github.com/TamrielNetwork/SpecPlayer/blob/main/LICENSE for more details.
 */
package com.tamrielnetwork.specplayer.utils;

import com.tamrielnetwork.specplayer.SpecPlayer;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Utils {

	private static final SpecPlayer main = JavaPlugin.getPlugin(SpecPlayer.class);

	public static void sendMessage(CommandSender player, String message) {
		player.sendMessage(replaceColors(Objects.requireNonNull(main.getMessages().getMessagesConf().getString(message))));
	}

	public static String replaceColors(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
}