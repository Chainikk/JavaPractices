package pr_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1 extends JFrame {
    private JTextField textField;
    private JButton button;
    private int randomNumber;
    private int attempts;

    public task1() {
        setTitle("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        textField = new JTextField(10);
        add(textField);

        button = new JButton("Guess");
        button.addActionListener(new GuessListener());
        add(button);

        randomNumber = (int) (Math.random() * 21);
        attempts = 0;
    }

    private class GuessListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int guess = Integer.parseInt(textField.getText());
            attempts++;

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
                System.exit(0);
            }
            else if (attempts == 3) {
                JOptionPane.showMessageDialog(null, "Game Over. You have used all your attempts. The number was " + randomNumber + ".");
                System.exit(0);
            }
            else {
                if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Wrong guess! The number is greater.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Wrong guess! The number is smaller.");
                }
            }

            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                task1 game = new task1();
                game.setVisible(true);
            }
        }
        );
    }
}

