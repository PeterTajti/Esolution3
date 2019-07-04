import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics grafika1) {

        for (int i = 1; i < 18; i++){
            grafika2(grafika1, i*18, i*18);
        }

    }

    public static void grafika2(Graphics grafika3, int x, int y) {
        grafika3.setColor(Color.MAGENTA);
        grafika3.drawLine(x, 0, 320, y);
        grafika3.setColor(Color.GREEN);
        grafika3.drawLine(0, y, x, 320);
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
