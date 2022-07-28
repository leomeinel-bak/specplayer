/*
 * SpecPlayer is a Spigot Plugin that gives players the ability to spectate others.
 * Copyright © 2022 Leopold Meinel & contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/LeoMeinel/SpecPlayer/blob/main/LICENSE
 */

package com.tamrielnetwork.specplayer.utils.commands;

import com.tamrielnetwork.specplayer.utils.Chat;
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

	public static boolean isInvalidCmd(@NotNull CommandSender sender, Player player, @NotNull String perm) {
		return Cmd.isInvalidSender(sender) || Cmd.isNotPermitted(sender, perm) || Cmd.isInvalidPlayer(sender, player);
	}

	public static boolean isInvalidCmd(@NotNull CommandSender sender, @NotNull String perm,
	                                   Map<UUID, Location> lastLocation) {
		return Cmd.isInvalidSender(sender) || Cmd.isNotPermitted(sender, perm) || hasNoLastLocation(sender,
		                                                                                            lastLocation);
	}

	private static boolean hasNoLastLocation(@NotNull CommandSender sender, Map<UUID, Location> lastLocation) {
		Player senderPlayer = (Player) sender;
		if (!lastLocation.containsKey(senderPlayer.getUniqueId())) {
			Chat.sendMessage(sender, "cmd");
			return true;
		}
		Chat.sendMessage(sender, "back");
		return false;
	}
}
