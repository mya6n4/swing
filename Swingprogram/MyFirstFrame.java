import java.awt.*;


import javax.swing.*;
class MyFristFrame{
    public static void main(String args[]){
        JFrame frame= new JFrame();
        frame.setSize(700, 500);   // important to see the window
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,50);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("My first frame");

        ImageIcon icon = new ImageIcon("C:\\Users\\Dell\\OneDrive\\Desktop\\swing\\Swingprogram\\khadeeja-yasser-3U9L9Chc3is-unsplash.jpg");
        frame.setIconImage(icon.getImage());
        Container c = frame.getContentPane();
        c.setBackground(Color.RED);
         frame.setResizable(false);

    }
}