import java.awt.Color;
import java.awt.Font;
import  javax.swing.*;
public class Main {
    static JFrame frame = new JFrame("Musclemass FitnessApp");
    static double age;
    static double weight;
    static double height;

    public static void main(String[] args) {
        
        JLabel logo = new JLabel("MuscleMass Fitness App");
        logo.setBounds(205, 650, 150, 90);
        logo.setForeground(Color.white);
        logo.setFont(new Font("Arial", Font.BOLD, 10));

        SignUp.createPanel();
        Interface.showInterface();
    }
}