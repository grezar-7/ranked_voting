import javax.swing.*;
import java.awt.*;
public class Gui {
    public static void initialTemplate() {
        //create JFrame Object
        JFrame jframe = new JFrame("GUI Screen");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size for GUI screen
        jframe.setSize(400,400);

        //create menubar buttons
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");



        //create JButton objects
        JButton pressButton = new JButton(("Press"));

        jframe.getContentPane().add(pressButton);



        JButton btn_send = new JButton("Enter");
        JButton btn_reset = new JButton("Reset");

        //code for File button
        JMenuItem fileMenuFile = new JMenuItem("new file");
        JMenuItem fileMenuSave = new JMenuItem(("Save as"));



        //create Text Area
        JTextArea textArea = new JTextArea();

        //create panel
        JPanel panel = new JPanel();
        JLabel label = new JLabel(("Please Enter New Voting Object"));

        //puts how many characters can be entered into text-field
        JTextField textField = new JTextField(15);

        //add section

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        fileMenu.add(fileMenuFile);
        fileMenu.add(fileMenuSave);

        panel.add(textField);
        panel.add(btn_send);
        panel.add(btn_reset);
        panel.add(label);


        //putting placement
        jframe.getContentPane().add(BorderLayout.SOUTH,panel);
        jframe.getContentPane().add(BorderLayout.NORTH,menuBar);
        jframe.getContentPane().add(BorderLayout.CENTER,textArea);

        jframe.setVisible(true);
    }
}