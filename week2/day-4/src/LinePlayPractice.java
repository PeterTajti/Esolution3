import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayPractice {
    public static void mainDraw(Graphics localgraphics){



        for (int i =0; i < 8; i+=1){
            drawtile(localgraphics, 40,0,0);
                for (int j =0; j < 8; j++){
                    drawtile(localgraphics, 40,0+(40*i),0+(40*j));

                }

        }
    }

//    public static void drawLine (Graphics g, int x, int y) {
//
//        g.setColor(Color.MAGENTA);
//        g.drawLine(x, y, WIDTH, HEIGHT/2);
//
//    }

    public static void drawtile (Graphics g, int tileSize,int shiftx,int shifty){
        int lineCount = 10;
        //int tileSize = 160;
        int lineShift = tileSize / lineCount;
//        int shiftx = 50;
//        int shifty = 50;

        for (int i = 1; i < lineCount; i++){
            g.setColor(Color.RED);
            g.drawLine(i*lineShift+shiftx, 0+shifty, tileSize+shiftx, i*lineShift+shifty);
            g.setColor(Color.GREEN);
            g.drawLine(0+shiftx, i*lineShift+shifty, i*lineShift+shiftx, tileSize+shifty);
        }


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
        panel.setBackground(Color.BLACK);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}