import javax.swing.*;
public class Gui {
    public static void main(String[] args) {
        //create JFrame Object
        JFrame jframe = new JFrame("GUI Screen");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size for GUI screen
        jframe.setSize(400,400);

        //create JButton objects
        JButton pressButton = new JButton(("Press"));

        jframe.getContentPane().add(pressButton);

        jframe.setVisible(true);
    }
}