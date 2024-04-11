import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginWindow() {
        setTitle("Login");
        setSize(300, 150); // Changed the size for better fitting
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Changed the layout to BoxLayout

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15); // Set preferred width for better appearance
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15); // Set preferred width for better appearance
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Simple check for demonstration, replace this with your authentication logic
        if (email.equals("kamalpreet@gmail.com") && password.equals("singh@3580")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect email or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginWindow();
            }
        });
    }
}
