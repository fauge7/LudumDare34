package com.fauge.games.twobuttontakeover.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fauge.games.twobuttontakeover.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 500;
		config.width = 500;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
