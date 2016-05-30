package com.ajayrahul.flash;

import com.ajayrahul.flash.screen.GameScreen;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class FlashGame extends Game  {

	public static Vector2 screen = new Vector2(0, 0);
	public static float screenArea;
	public static Vector2 screenCenter = new Vector2(0,0);



	@Override
	public void create () {
		Gdx.app.log("TheFlashGame", "created");
		screen.set(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		screenArea = screen.x * screen.y;
		screenCenter.set(screen.x/2,screen.y/2);
		setScreen(new GameScreen());
	}

}
