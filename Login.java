import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Login extends JFrame implements ActionListener {
    // Constructor
    public Login() {
        // Set frame properties (title, size, etc.)
        setTitle("Login Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create UI components (labels, text fields, buttons, etc.)
        // Add them to the frame
        // Implement event handling for login button
    }

    // Override actionPerformed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle login button click
        // Check if username and password match predefined values
        // Show appropriate message (success or error)
    }

    public static void main(String[] args) {
        // Create an instance of LoginFrame
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
}
