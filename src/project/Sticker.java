package project;

import comp127graphics.CanvasWindow;
import comp127graphics.Image;
import comp127graphics.ui.Button;

public class Sticker {

    private Button b1;
    private Button b2;
    private Image pic1;
    private Image pic2;

    public Sticker() {
        b1 = new Button("SmileyFace ");
        b2 = new Button("FrownyFace ");
        pic1 = new Image(0,0,"smile.png");
        pic2 = new Image(0,0,"cry.jpg");
    }

    public void run(CanvasWindow canvas,Image image, double l) {
        b1.setPosition(image.getWidth()+l+10,0);
        b2.setPosition(image.getWidth()+l+10,25);
        canvas.add(b1);
        canvas.add(b2);
        canvas.draw();
//        b1.onClick(d->canvas.add(pic1,d));
//        b2.onClick(d->canvas.add(pic2,d));
    }
}
