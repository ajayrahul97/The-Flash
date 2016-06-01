package com.ajayrahul.flash.gameworld;

import com.ajayrahul.flash.FlashGame;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by ajayrahul on 26/5/16.
 */
public class GameRenderer {

    private GameWorld myWorld;
    public static OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;


    public GameRenderer(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, FlashGame.screen.x, FlashGame.screen.y);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render() {
        Gdx.app.log("GameRenderer", "render");
         //Draw a black background.

        Gdx.gl.glClearColor(0,0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Draw the Filled rectangle
        // Tells shapeRenderer to begin drawing filled shapes
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);        // Chooses RGB Color of 87, 109, 120 at full opacity
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        // Draws the circle from myWorld (Using ShapeType.Filled)
        shapeRenderer.circle(myWorld.flash.postion.x,myWorld.flash.postion.y,myWorld.flash.radius);
        shapeRenderer.end();


         //Circle's outline
        // Tells shapeRenderer to draw an outline of the following shapes
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);           // Chooses RGB Color of 255, 109, 120 at full opacity
        shapeRenderer.circle(myWorld.flash.postion.x,myWorld.flash.postion.y,myWorld.flash.radius);         // Draws the circle from myWorld (Using ShapeType.Line)
        shapeRenderer.end();

    }
}