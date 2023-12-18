import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ChooseColor extends JFrame {
    JPanel panel;
    Color bgColor = Color.LIGHT_GRAY;

    public ChooseColor() {
        panel = new JPanel(new BorderLayout());

        JButton btnColor = new JButton("Change Color");
        panel.add(btnColor, BorderLayout.SOUTH);
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Color color = JColorChooser.showDialog(ChooseColor.this,
                        "Choose a color", bgColor);
                if (color != null) { //new color selected
                    bgColor = color;
                }
                panel.setBackground(bgColor);
            }
        });

        setContentPane(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JColorChooser Demo");
        setSize(300, 200);
        setLocationRelativeTo(null);  //center the application window
        setVisible(true);             //show it
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChooseColor();
            }
        });
    }
}