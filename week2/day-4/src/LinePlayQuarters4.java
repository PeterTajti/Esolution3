import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters4 {

    public static void mainDraw (Graphics grafika1){

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                drawtile(grafika1, 0, 160);

            }
        }
    }

    public static void drawtile (Graphics grafika3, int w, int z){

        for (int i =0; i < 18; i++) {
            int x = i *9;
            int y = i *9;
            grafika3.setColor(Color.MAGENTA);
            grafika3.drawLine(x, w, z, y);
            grafika3.setColor(Color.GREEN);
            grafika3.drawLine(w, y, x, z);

        }

    }






    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
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

