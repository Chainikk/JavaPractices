package pr_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class match {
    public static void main(String[] args) {
        MatchTable game = new MatchTable();
        game.setVisible(true);
    }
}

class MatchTable extends JFrame {
    int point_real = 0;
    int point_milan = 0;
    String lastGoal = "N/A";
    String winner = "DRAW";
    JButton button_real = new JButton("Real Madrid");
    JButton button_milan = new JButton("AC Milan");
    JLabel result = new JLabel("Result: "+point_real+" X "+point_milan);
    JLabel last = new JLabel("Last Scorer: "+lastGoal);
    JLabel win = new JLabel("Winner: "+winner);

    MatchTable() {
        super("AC Milan vs Real Madrid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);
        Container container = getContentPane();
        container.setLayout(new GridLayout(3,3, 50, 5));
        container.add(new JLabel());
        container.add(last);
        container.add(new JLabel());
        container.add(button_real);
        container.add(result);
        container.add(button_milan);
        container.add(new JLabel());
        container.add(win);
        container.add(new JLabel());
        button_milan.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                point_milan++;
                lastGoal = "AC Milan";
                if (point_milan > point_real) winner = "AC Milan";
                else if (point_real == point_milan) winner = "DRAW";
                else winner = "Real Madrid";
                result.setText("Result: "+point_real+" X "+point_milan);
                last.setText("Last Scorer: "+lastGoal);
                win.setText("Winner: "+winner);
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        button_real.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                point_real++;
                lastGoal = "Real Madrid";
                if (point_milan > point_real) winner = "AC Milan";
                else if (point_real == point_milan) winner = "DRAW";
                else winner = "Real Madrid";
                result.setText("Result: "+point_real+" X "+point_milan);
                last.setText("Last Scorer: "+lastGoal);
                win.setText("Winner: "+winner);
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        }
        );
    }
}
