import java.awt.*;
import javax.swing.*;

public class Interface extends Main {
    public static void showInterface() {
        JPanel panel = new JPanel();
        Font customFont = new Font("Arial", Font.BOLD,24);
        panel.setBackground(new Color(46,46,46));
        panel.setLayout(null);

        JLabel logo = new JLabel("MuscleMass Fitness App");
        logo.setBounds(205, 650, 150, 90);
        logo.setForeground(Color.white);
        logo.setFont(new Font("Arial", Font.BOLD, 10));

        JLabel label = new JLabel("Welcome to the Interface!");
        label.setBounds(150, 300, 300, 50);
        label.setFont(customFont);
        label.setForeground(Color.white);
        panel.add(label);
        panel.add(logo);

        frame.add(panel); // tek frame kullanıyoruz
        frame.revalidate();
        frame.repaint();
    }
}