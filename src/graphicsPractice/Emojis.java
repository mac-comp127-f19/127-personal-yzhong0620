package graphicsPractice;

import comp127graphics.*;
import javaFoundations4thEd.ch3.CircleStats;

import java.awt.*;

@SuppressWarnings("WeakerAccess")
public class Emojis {
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B);

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleSmiley = createSmileyFace(100);
        littleSmiley.setPosition(50, 400);
        canvas.add(littleSmiley);

        GraphicsGroup mediumSmiley = createFrownyFace(200);
        mediumSmiley.setPosition(150, 300);
        canvas.add(mediumSmiley);

        GraphicsGroup bigSmiley = createWinkingFace(300);
        bigSmiley.setPosition(350, 200);
        canvas.add(bigSmiley);
    }

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Ellipse eyeL = createEye(size*0.1,size*0.1);
        eyeL.setCenter(size*0.25,size*0.25);
        group.add(eyeL);

        Ellipse eyeR = createEye(size*0.1,size*0.1);
        eyeR.setCenter(size*0.75,size*0.25);
        group.add(eyeR);
        return group;
    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Ellipse createEye(double size1, double size2){
        Ellipse eye = new Ellipse(0,0,size1,size2);
        eye.setFillColor(Color.black);
        eye.setStrokeColor(Color.black);
        eye.setStrokeWidth(0.5);
        return eye;
    }

    public static GraphicsGroup createFrownyFace(double size){
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Arc mouth = createFrown(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Ellipse eyeL = createEye(size*0.1,size*0.1);
        eyeL.setCenter(size*0.25,size*0.25);
        group.add(eyeL);

        Ellipse eyeR = createEye(size*0.1,size*0.1);
        eyeR.setCenter(size*0.75,size*0.25);
        group.add(eyeR);
        return group;
    }

    private static Arc createFrown(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 20, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    public static GraphicsGroup createWinkingFace(double size){
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Ellipse eyeL = createEye(size*0.1,size*0.1);
        eyeL.setCenter(size*0.25,size*0.25);
        group.add(eyeL);

        Line eyeR = createNewEye(size);
        eyeR.setCenter(size*0.75,size*0.25);
        group.add(eyeR);
        return group;
    }

    private static Line createNewEye(double size){
        Line eye = new Line(size*0.6,size*0.25,size*0.8,size*0.25);
        eye.setStrokeWidth(4);
        return eye;
    }
}
