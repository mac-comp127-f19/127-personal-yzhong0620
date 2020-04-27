package project;

import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsText;
import comp127graphics.Point;

import java.util.Scanner;

public class Text {

    private String text;
    private GraphicsText txt;

    public Text(){
        Scanner sc = new Scanner(System.in);
        text = sc.next("Enter text: ");
        txt = new GraphicsText(text);
    }

    public void write(Point p, CanvasWindow canvas){
        txt.setPosition(p);
        canvas.add(txt);
    }
}
