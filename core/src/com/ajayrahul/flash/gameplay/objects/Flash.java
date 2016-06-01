package com.ajayrahul.flash.gameplay.objects;

import com.ajayrahul.flash.FlashGame;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by ajayrahul on 1/6/16.
 */
public class Flash extends Vector2 {

    public Vector2 postion;
    public float radius;
    public Flash() {
        postion= FlashGame.screenCenter;
        // Setting the radius such that it is (1/300)th the size of screen.
        this.radius = (int) Math.sqrt(FlashGame.screenArea/(100* MathUtils.PI));
    }
}
