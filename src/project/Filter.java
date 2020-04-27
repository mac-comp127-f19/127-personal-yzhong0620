package project;

import comp127graphics.CanvasWindow;
import comp127graphics.Image;
import comp127graphics.ui.Button;

public class Filter {

    private Button b1;
    private Button b2;
    private Button b3;

    public Filter() {
        b1 = new Button("Normal     ");
        b2 = new Button("Red        ");
        b3 = new Button("Blue       ");
    }

    public void draw(CanvasWindow canvas, Image image, double l){
        b1.setPosition(image.getWidth()+l+10,0);
        b2.setPosition(image.getWidth()+l+10,25);
        b3.setPosition(image.getWidth()+l+10,50);
        canvas.add(b1);
        canvas.add(b2);
        canvas.add(b3);
        canvas.draw();
    }
}
