package pr_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuSelection extends JFrame {
    private JComboBox<String> menuComboBox;
    private JTextArea infoTextArea;

    public MenuSelection() {
        setTitle("Выбор меню");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        String[] menuItems = {"Россия", "США", "Китай", "Япония", "Германия"};
        menuComboBox = new JComboBox<>(menuItems);
        menuComboBox.addActionListener(new MenuComboBoxListener());

        infoTextArea = new JTextArea();
        infoTextArea.setEditable(false);

        setLayout(new BorderLayout());
        add(menuComboBox, BorderLayout.NORTH);
        add(new JScrollPane(infoTextArea), BorderLayout.CENTER);
    }

    private class MenuComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedCountry = (String) menuComboBox.getSelectedItem();
            String countryInfo = "";

            switch (selectedCountry) {
                case "Россия":
                    countryInfo = "Столица: Москва\nНаселение: 146.6 млн\nПлощадь: 17.1 млн км²";
                    break;
                case "США":
                    countryInfo = "Столица: Вашингтон, Д.С.\nНаселение: 328.2 млн\nПлощадь: 9.8 млн км²";
                    break;
                case "Китай":
                    countryInfo = "Столица: Пекин\nНаселение: 1.4 млрд\nПлощадь: 9.6 млн км²";
                    break;
                case "Япония":
                    countryInfo = "Столица: Токио\nНаселение: 126.5 млн\nПлощадь: 377 тыс км²";
                    break;
                case "Германия":
                    countryInfo = "Столица: Берлин\nНаселение: 82.8 млн\nПлощадь: 357 тыс км²";
                    break;
            }

            infoTextArea.setText(countryInfo);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuSelection().setVisible(true);
            }
        });
    }
}


