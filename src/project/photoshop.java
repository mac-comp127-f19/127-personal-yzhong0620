package project;

import comp127graphics.CanvasWindow;
import comp127graphics.Image;
import comp127graphics.ui.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The game of Photoshop.
 *
 */

public class photoshop {

    private CanvasWindow canvas;
    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;
    private Image image;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Filter filter;
    private Text text;
    private Sticker sticker;

    /**
     * Create a new Photoshop.
     */

    public static void main(String[] args){
        new photoshop();
    }

    /**
     *  Create a canvas.
     */

    public photoshop() {
        canvas = new CanvasWindow("Photoshop!", CANVAS_WIDTH,CANVAS_HEIGHT);
        image = new Image(0, 0, "download.jpg");
        filter = new Filter();
//        text = new Text();
        sticker = new Sticker();
        canvas.add(image);

        b1 = new Button ("Filter     ");
        b1.setPosition(image.getWidth()+10,0);
        canvas.add(b1);
        double b1l = b1.getBounds().getWidth();

        b2 = new Button ("Drawing    ");
        b2.setPosition(image.getWidth()+10,25);
        double b2l = b2.getBounds().getWidth();
        canvas.add(b2);

        b3 = new Button ("Sticker    ");
        b3.setPosition(image.getWidth()+10,50);
        canvas.add(b3);
        double b3l = b3.getBounds().getWidth();

        b4 = new Button ("Text       ");
        b4.setPosition(image.getWidth()+10,75);
        double b4l = b4.getBounds().getWidth();
        canvas.add(b4);

        List list = new ArrayList();
        list.add(b1l);
        list.add(b2l);
        list.add(b3l);
        list.add(b4l);

        canvas.draw();

        double max = (double) Collections.max(list);

        b1.onClick(()->filter.draw(canvas,image,max));
        b3.onClick(()->sticker.run(canvas,image,max));
//        canvas.onClick(event -> text.write(event,canvas));
    }

}