package com.ajayrahul.flash.gameworld;

import com.ajayrahul.flash.FlashGame;
import com.ajayrahul.flash.gameplay.controller.FlashController;
import com.ajayrahul.flash.gameplay.objects.Flash;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by ajayrahul on 26/5/16.
 */
public class GameWorld {

    public Flash flash;
    public FlashController flashController;

    public GameWorld() {

        flash = new Flash();
        flashController = new FlashController(flash);

    }

    public void update(float delta) {
        Gdx.app.log("GameWorld", "update");
        flashController.control();

    }
}