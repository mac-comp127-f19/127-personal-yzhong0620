package project;

import comp127graphics.CanvasWindow;
import comp127graphics.Image;

import javax.imageio.ImageIO;
import java.net.URL;

/**
 * The game of Photoshop.
 *
 */

public class photoshop {

    private CanvasWindow canvas;
    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;
    private Image image;

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
        canvas = new CanvasWindow("Photoshop!", CANVAS_WIDTH,CANVAS_HEIGHT);
        image = new Image(0,0,"Mario.png");
        canvas.add(image);
        canvas.draw();
    }
}