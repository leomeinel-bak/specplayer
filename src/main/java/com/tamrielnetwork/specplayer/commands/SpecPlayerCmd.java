/*
 SpecPlayer is a Spigot Plugin, to give players the ability to spectate others.
 Copyright (C) 2022  Leopold Meinel

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program. If not, see https://github.com/TamrielNetwork/SpecPlayer/blob/main/LICENSE.
 */
package com.tamrielnetwork.specplayer.commands;

import com.tamrielnetwork.specplayer.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class SpecPlayerCmd implements CommandExecutor {

	final HashMap<Player, Location> lastLocation = new HashMap<>();

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		// Check args length
		if (args.length == 0) {
			executeBack(sender);
		} else {
			executeSpectate(sender, args);
		}

		return true;
	}

	private void executeSpectate(CommandSender sender, String[] args) {
		// Check if command sender is a player
		if (!(sender instanceof Player)) {
			Utils.sendMessage(sender, "player-only");
			return;
		}
		// Check args length
		if (args.length != 1) {
			Utils.sendMessage(sender, "no-args");
			return;
		}
		// Check permissions
		if (!sender.hasPermission("specplayer.spectate")) {
			Utils.sendMessage(sender, "no-perms");
			return;
		}
		// Set player
		Player player = Bukkit.getPlayer(args[0]);
		// Check if the given player is registered
		if (player == null) {
			Utils.sendMessage(sender, "invalid-player");
			return;
		}
		// Set sender gamemode to spectator
		((Player) sender).setGameMode(GameMode.SPECTATOR);
		// Set senderLocation
		@NotNull Location senderLocation = ((Player) sender).getLocation();
		// Save senderLocation to lastLocation
		lastLocation.put((Player) sender, senderLocation);
		// Teleport sender to player
		((Player) sender).teleport(player.getLocation());
	}

	private void executeBack(CommandSender sender) {
		// Check if command sender is a player
		if (!(sender instanceof Player)) {
			Utils.sendMessage(sender, "player-only");
			return;
		}
		// Check permissions
		if (!sender.hasPermission("specplayer.spectate")) {
			Utils.sendMessage(sender, "no-perms");
			return;
		}
		// Set gamemode to survival
		((Player) sender).setGameMode(GameMode.SURVIVAL);
		// Teleport sender to lastLocation
		if (lastLocation.containsKey((Player) sender)) {
			((Player) sender).teleport(lastLocation.get((Player) sender));
			lastLocation.remove((Player) sender);
		}
	}
}
