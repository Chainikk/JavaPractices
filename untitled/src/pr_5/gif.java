package pr_5;
import javax.swing.*;
public class gif {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Gif");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,600);
            frame.setLocationRelativeTo(null);
            String gif_path = "C:\\Users\\Misha\\Desktop\\Java\\5пр.gif";
            ImageIcon gif = new ImageIcon(gif_path);
            JLabel lab = new JLabel(gif);
            frame.add(lab);
            frame.setVisible(true);
        }
}
