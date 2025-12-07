import java.awt.*;                     // Used for Font, Container, etc.
import javax.swing.*;                  // Used for JFrame, JLabel, etc.

public class JLabelDemo {              // Class name should start with Capital letter

    public static void main(String args[]) {

        JFrame frame = new JFrame();   // Creating main window (frame)
        frame.setBounds(100, 100, 1000, 500); // Setting position & size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit

        Container c = frame.getContentPane(); // Getting container of frame
        c.setLayout(null);             // Removing default layout to use manual positioning

        JLabel label = new JLabel();   // Creating empty JLabel
        label.setBounds(100, 50, 200, 30); // Setting position & size of JLabel

        label.setText("Password");    // Setting text inside JLabel

        Font font = new Font("Arial", Font.PLAIN, 30); // Creating Font object
        label.setFont(font);          // Applying font to JLabel

        c.add(label);                 // Adding label to frame container

        frame.setVisible(true);       // Making frame visible (ALWAYS AT END)
    }
}
