package pr_15;

import javax.swing.*;
import java.awt.*;

public class task3 {
    public static void main(String[] args) {
        int width = 500, height = 170;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);

        // File
        JMenu file = new JMenu("File");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(save); file.add(exit);

        // Edit
        JMenu edit = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(copy); edit.add(cut); edit.add(paste);

        // Help
        JMenu help = new JMenu("Help");

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file); menuBar.add(edit); menuBar.add(help);
        frame.setJMenuBar(menuBar);

        // Grid Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2, 10, 10));
        panel.setSize(width, 40);

        // Buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        panel.add(button1); panel.add(button2);

        frame.add(panel);

        JTextField text = new JTextField("This is the area you can write text in.");
        text.setHorizontalAlignment(JTextField.CENTER);
        frame.add(text);

        frame.setVisible(true);
    }
}
