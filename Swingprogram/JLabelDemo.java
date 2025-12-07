import java.awt.*;                     // Used for Font, Container, etc.
import javax.swing.*;                  // Used for JFrame, JLabel, etc.

public class JLabelDemo {              // Class name should start with Capital letter

    public static void main(String args[]) {

        JFrame frame = new JFrame();   // Creating main window (frame)
        frame.setBounds(100, 100, 1000, 500); // Setting position & size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit

        Container c = frame.getContentPane(); // Getting container of frame
        c.setLayout(null);             // Removing default layout to use manual positioning

        // // JLabel label = new JLabel();   // Creating empty JLabel
        // label.setBounds(100, 50, 200, 30); // Setting position & size of JLabel

        // label.setText("Password");    // Setting text inside JLabel

        // Font font = new Font("Arial", Font.PLAIN, 30); // Creating Font object
        // label.setFont(font);          // Applying font to JLabel
  

         // ✅ Load image
        // ImageIcon icon = new ImageIcon(
        //     "C:\\Users\\Dell\\OneDrive\\Desktop\\swing\\Swingprogram\\khadeeja-yasser-3U9L9Chc3is-unsplash.jpg"
        // );

        // // ✅ Create JLabel with BOTH text + image
        // JLabel label = new JLabel("Text", icon, JLabel.CENTER);

        // // ✅ Set position & size
        // label.setBounds(0, 0, 1000, 500);

        // // ✅ Add to container FIRST
        // c.add(label);

        // // ✅ Then make frame visible
        // frame.setVisible(true);  
         ImageIcon icon = new ImageIcon(
            "C:\\Users\\Dell\\OneDrive\\Desktop\\swing\\Swingprogram\\khadeeja-yasser-3U9L9Chc3is-unsplash.jpg"
        );

        // ✅ Set FIXED image size (you can change 400x300)
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon fixedIcon = new ImageIcon(scaledImg);

        // ✅ Create JLabel with fixed-size image
        JLabel label = new JLabel("Starbucks", fixedIcon, JLabel.CENTER);

// ✅ Text on top of image
label.setHorizontalTextPosition(JLabel.CENTER);
label.setVerticalTextPosition(JLabel.CENTER);

// ✅ Text styling
label.setForeground(Color.WHITE);
label.setFont(new Font("Arial", Font.BOLD, 28));
        


        // ✅ CENTER the image manually
        int x = (1000 - 400) / 2;   // frame width - image width
        int y = (500 - 300) / 2;    // frame height - image height
        label.setBounds(x, y, 400, 300);

        c.add(label);
        frame.setVisible(true);
    }
}