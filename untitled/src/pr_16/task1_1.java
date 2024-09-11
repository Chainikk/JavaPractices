package pr_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class task1_1 extends JFrame {
    private JLabel centerLabel;
    private JLabel westLabel;
    private JLabel southLabel;
    private JLabel northLabel;
    private JLabel eastLabel;

    public task1_1() {
        setTitle("Mouse Events");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        centerLabel = new JLabel("CENTER");
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        centerLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centerLabel.addMouseListener(new MouseListener("Добро пожаловать в ЦАО"));
        add(centerLabel, BorderLayout.CENTER);

        westLabel = new JLabel("WEST");
        westLabel.setHorizontalAlignment(JLabel.CENTER);
        westLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        westLabel.addMouseListener(new MouseListener("Добро пожаловать в ЗАО"));
        add(westLabel, BorderLayout.WEST);

        southLabel = new JLabel("SOUTH");
        southLabel.setHorizontalAlignment(JLabel.CENTER);
        southLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        southLabel.addMouseListener(new MouseListener("Добро пожаловать в ЮАО"));
        add(southLabel, BorderLayout.SOUTH);

        northLabel = new JLabel("NORTH");
        northLabel.setHorizontalAlignment(JLabel.CENTER);
        northLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        northLabel.addMouseListener(new MouseListener("Добро пожаловать в САО"));
        add(northLabel, BorderLayout.NORTH);

        eastLabel = new JLabel("EAST");
        eastLabel.setHorizontalAlignment(JLabel.CENTER);
        eastLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        eastLabel.addMouseListener(new MouseListener("Добро пожаловать в ВАО"));
        add(eastLabel, BorderLayout.EAST);
    }

    private class MouseListener extends MouseAdapter {
        private String message;

        public MouseListener(String message) {
            this.message = message;
        }

        public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(null, message);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                task1_1 app = new task1_1();
                app.setVisible(true);
            }
        });
    }
}

