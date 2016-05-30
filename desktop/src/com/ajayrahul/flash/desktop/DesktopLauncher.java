package com.ajayrahul.flash.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ajayrahul.flash.FlashGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Flash";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new FlashGame(), config);
	}
}
