import javax.swing.*;
import java.awt.*;

public class MickeyMouseFace extends JFrame {

    public MickeyMouseFace() {
        setTitle("Mickey Mouse Face");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //head
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 200, 200);

        //ears
        g.fillOval(60, 120, 80, 80);
        g.fillOval(260, 120, 80, 80);

        //eyes
        g.setColor(Color.WHITE);
        g.fillOval(150, 160, 40, 40);
        g.fillOval(210, 160, 40, 40);

        //pupils
        g.setColor(Color.BLACK);
        g.fillOval(170, 180, 10, 10);
        g.fillOval(230, 180, 10, 10);

        //nose
        g.fillOval(195, 200, 10, 10);

        //mouth
        g.setColor(Color.WHITE);
        g.drawArc(180, 220, 40, 20, 0, -180);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MickeyMouseFace());
    }
}



