package project;

import comp127graphics.CanvasWindow;

/**
 * The game of Breakout.
 *
 */

public class photoshop {

    private CanvasWindow canvas;

    /**
     * Create a new BreakoutGame.
     */

    public static void main(String[] args){
        new photoshop();
    }

    /**
     *  Create a canvas.
     */

    public photoshop() {
        canvas = new CanvasWindow("Breakout!", 1,1);
    }
}