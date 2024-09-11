package pr_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame {
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public task2() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);

        colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ColorListener(Color.BLUE));
        redItem.addActionListener(new ColorListener(Color.RED));
        blackItem.addActionListener(new ColorListener(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontListener("Courier New"));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
    }

    private class ColorListener implements ActionListener {
        private Color color;

        public ColorListener(Color color) {
            this.color = color;
        }

        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontListener implements ActionListener {
        private String fontName;

        public FontListener(String fontName) {
            this.fontName = fontName;
        }

        public void actionPerformed(ActionEvent e) {
            Font font = new Font(fontName, Font.PLAIN, 12);
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                task2 textEditor = new task2();
                textEditor.setVisible(true);
            }
        });
    }
}

