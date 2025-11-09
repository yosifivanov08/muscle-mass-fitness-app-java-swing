import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class SignUp extends Main { // 🔥 Main’den miras alıyoruz
    
    public static void createPanel() {

        JPanel signUpPanel = new JPanel();
        Font signUpFont = new Font("Arial", Font.BOLD, 20);

        frame.setSize(540, 760);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpPanel.setBackground(new Color(57, 57, 57));
        signUpPanel.setLayout(null);

        JButton confirm = new JButton("CONFIRM");
        confirm.setBounds(215, 600, 110, 50);
        confirm.setFocusable(false);
        confirm.setFont(new Font("Arial", Font.BOLD, 15));
        confirm.setForeground(Color.black);
        confirm.setBackground(Color.green);
        confirm.setBorder(new LineBorder(Color.black));

        JLabel errorLabel = new JLabel();
        errorLabel.setBounds(160, 330, 250, 40);
        errorLabel.setFont(new Font("Arial", Font.BOLD, 15));
        errorLabel.setForeground(Color.red);
        signUpPanel.add(errorLabel);

        JLabel logo = new JLabel("MuscleMass Fitness App");
        logo.setBounds(205, 650, 150, 90);
        logo.setForeground(Color.white);
        logo.setFont(new Font("Arial", Font.BOLD, 10));

        JTextField enterAge = new JTextField();
        JLabel ageLabel = new JLabel("Enter Your Age");
        ageLabel.setBounds(197, 65, 200, 40);
        ageLabel.setFont(signUpFont);
        ageLabel.setForeground(Color.white);
        enterAge.setBounds(220, 105, 100, 20);
        enterAge.setFont(signUpFont);
        enterAge.setHorizontalAlignment(JTextField.CENTER);
        enterAge.setBorder(new LineBorder(Color.black));

        JTextField enterWeight = new JTextField();
        JLabel weightLabel = new JLabel("Enter Your Weight");
        weightLabel.setBounds(185, 150, 230, 40);
        weightLabel.setFont(signUpFont);
        weightLabel.setForeground(Color.white);
        enterWeight.setBounds(220, 190, 100, 20);
        enterWeight.setFont(signUpFont);
        enterWeight.setHorizontalAlignment(JTextField.CENTER);
        enterWeight.setBorder(new LineBorder(Color.black));

        JTextField enterHeight = new JTextField();
        JLabel heightLabel = new JLabel("Enter Your Height");
        heightLabel.setBounds(185, 240, 230, 40);
        heightLabel.setFont(signUpFont);
        heightLabel.setForeground(Color.white);
        enterHeight.setBounds(220, 280, 100, 20);
        enterHeight.setFont(signUpFont);
        enterHeight.setHorizontalAlignment(JTextField.CENTER);
        enterHeight.setBorder(new LineBorder(Color.black));

        signUpPanel.add(ageLabel);
        signUpPanel.add(enterAge);
        signUpPanel.add(weightLabel);
        signUpPanel.add(enterWeight);
        signUpPanel.add(heightLabel);
        signUpPanel.add(enterHeight);
        signUpPanel.add(confirm);
        signUpPanel.add(logo);

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ageText = enterAge.getText().trim();
                String weightText = enterWeight.getText().trim();
                String heightText = enterHeight.getText().trim();

                if (ageText.isEmpty() || weightText.isEmpty() || heightText.isEmpty()) {
                    errorLabel.setText("PLEASE ENTER YOUR STATS");
                    return;
                }

                try {
                    age = Double.parseDouble(ageText);
                    weight = Double.parseDouble(weightText);
                    height = Double.parseDouble(heightText);
                    errorLabel.setText("");
                    System.out.println("Age: " + age);
                    System.out.println("Weight: " + weight);
                    System.out.println("Height: " + height);

                    // 🔥 Panel geçişi örneği
                    frame.getContentPane().removeAll();
                    SignUp.createPanel();
                    frame.revalidate();
                    frame.repaint();

                } catch (NumberFormatException ex) {
                    errorLabel.setText("PLEASE ENTER YOUR STATS");
                }
            }
        });

        frame.add(signUpPanel);
        frame.setVisible(true);
    }
}