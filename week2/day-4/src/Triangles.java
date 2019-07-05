import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    //21 emeletes a háromszögekből álló nagy háromszög

    public static void mainDraw(Graphics localgraphics){

    triangleunit(localgraphics);

    }

    public static void triangleunit (Graphics g) {

        int trainglerow;
        //int shiftx;
        //int shifty;


        g.drawLine(WIDTH/2, 0, WIDTH/2+10, 20);
        g.drawLine(WIDTH/2+10, 20, WIDTH/2-10, 20);
        g.drawLine(WIDTH/2-10, 20, WIDTH/2, 0);



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
