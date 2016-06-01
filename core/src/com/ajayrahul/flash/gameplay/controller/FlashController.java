package com.ajayrahul.flash.gameplay.controller;

import com.ajayrahul.flash.gameplay.objects.Flash;
import com.ajayrahul.flash.helpers.InputHandler;

/**
 * Created by ajayrahul on 1/6/16.
 */
public class FlashController {
    private Flash flash;

    public FlashController(Flash flash) {
        this.flash = flash;
    }

    public void control(){
        flash.postion.x= InputHandler.touch.x;
        flash.postion.y=InputHandler.touch.y;
    }

}
