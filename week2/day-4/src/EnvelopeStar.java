import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw (Graphics localgraphics){



        half1(localgraphics, WIDTH/2, HEIGHT/2-10);

    }

    public static void half1 (Graphics lines, int x, int y) {

        int linenumber = 15;


        for (int i = 0; i < linenumber; i++){
        lines.setColor(Color.RED);
        lines.drawLine(10+(10*i), WIDTH/2, WIDTH/2, 150-(10*i));
        }

        for (int j = 1; j < linenumber; j++){
            lines.setColor(Color.GREEN);
            lines.drawLine(10+(10*j), WIDTH/2, WIDTH/2, 150+(10*j));

        }

        for (int k = 1; k < linenumber; k++){
            lines.setColor(Color.BLUE);
            lines.drawLine(x, y+10-(10*k), WIDTH-10-(10*k), HEIGHT/2);

        }

        for (int m = 1; m < linenumber; m++){
            lines.setColor(Color.YELLOW);
            lines.drawLine(x, y+(10*m), WIDTH-10-(10*m), HEIGHT/2);

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