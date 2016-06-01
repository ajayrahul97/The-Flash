package com.ajayrahul.flash.helpers;

import com.ajayrahul.flash.gameworld.GameRenderer;
import com.ajayrahul.flash.screen.GameScreen;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by ajayrahul on 26/5/16.
 */
public class InputHandler implements InputProcessor {
    public static Vector3 touch = new Vector3(0,0,0);

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        GameScreen.isTouched = true;
        GameRenderer.cam.unproject(touch.set(screenX, screenY, 0));
        return false;
    }


    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        GameRenderer.cam.unproject(touch.set(screenX, screenY, 0));
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
