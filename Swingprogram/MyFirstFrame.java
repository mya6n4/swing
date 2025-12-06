import javax.swing.*;
class MyFristFrame{
    public static void main(String args[]){
        JFrame frame= new JFrame();
        frame.setSize(300, 200);   // important to see the window
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,50);
    }
}