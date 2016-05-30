package com.ajayrahul.flash.gameworld;

import com.ajayrahul.flash.FlashGame;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by ajayrahul on 26/5/16.
 */
public class GameWorld {

    private Circle cir = new Circle( FlashGame.screenCenter.x,0,14);

    public void update(float delta) {
        Gdx.app.log("GameWorld", "update");
        cir.y+=2;
        if (cir.y > FlashGame.screen.y) {
            cir.y = 0;
        }
    }

    public Circle getCirc() {
        return cir;
    }
}