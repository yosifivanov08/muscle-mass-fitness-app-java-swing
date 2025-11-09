import java.awt.*;
import javax.swing.*;

public class Interface extends Main {
    
    public static void showInterface() {
        frame.setSize(540, 760);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Font customFont = new Font("Arial", Font.BOLD,24);
        panel.setBackground(new Color(46,46,46));
        panel.setLayout(null);

        JButton showProfile = new JButton("Show Profile");
        showProfile.setBounds(195,200,150,70);
        showProfile.setFocusable(false);
        showProfile.setBackground(Color.white);


        panel.add(showProfile);

        frame.add(panel); // tek frame kullanıyoruz
        frame.revalidate();
        frame.repaint();
    }
}