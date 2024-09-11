package pr_5;
import javax.swing.*;

public class picture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1000,450); photo
        frame.setSize(750,625);
        frame.setLocationRelativeTo(null);
        String picture_path = "C:\\Users\\Maksim\\Desktop\\Джава\\фото практика 5\\1.jpg";
        ImageIcon image = new ImageIcon(picture_path);
        JLabel lab = new JLabel(image);
        frame.add(lab);
        frame.setVisible(true);
    }
}
