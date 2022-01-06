package com.tamrielnetwork.specplayer;

import com.tamrielnetwork.specplayer.commands.SpecPlayerCmd;
import com.tamrielnetwork.specplayer.files.Messages;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class SpecPlayer extends JavaPlugin {

	private Messages messages;

	@Override
	public void onEnable() {

		Objects.requireNonNull(getCommand("spec")).setExecutor(new SpecPlayerCmd());

		messages = new Messages();

		Bukkit.getLogger().info("§SpecPlayer " + this.getDescription().getVersion() + " enabled");
		Bukkit.getLogger().info("Copyright (C) 2022 Leopold Meinel");
		Bukkit.getLogger().info("This program comes with ABSOLUTELY NO WARRANTY!");
		Bukkit.getLogger().info("This is free software, and you are welcome to redistribute it under certain conditions.");
		Bukkit.getLogger().info("Visit https://github.com/TamrielNetwork/SpecPlayer/blob/main/LICENSE for more details.");
	}

	@Override
	public void onDisable() {

		Bukkit.getLogger().info("§SpecPlayer " + this.getDescription().getVersion() + " disabled");
	}

	public Messages getMessages() {
		return messages;
	}
}
