import javax.naming.directory.InitialDirContext;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics grafika1) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color indigo = new Color(128, 0, 128);
        Color violet = new Color (238,130,238);
        Color [] rainbow = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, indigo, violet};

        for (int i =0; i < rainbow.length; i++) {
            grafika2(grafika1, rainbow[i], 320-i*46);
        }




    }

    public static void grafika2 (Graphics grafika3, Color rainbow, int size) {

            grafika3.setColor(rainbow);
            grafika3.fillRect(160-size/2, 160-size/2, size, size);

    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}