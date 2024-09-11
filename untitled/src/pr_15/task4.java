package pr_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class task4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));

        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivide = new JButton("/");
        JButton buttonEquals = new JButton("=");
        JButton buttonDot = new JButton(".");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "9");
            }
        });
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "0");
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "+");
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "-");
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                textField.setText(textField.getText() + "*");
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + "/");
            }
        });
        buttonEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String expression = textField.getText();
                try {
                    double result = evaluateExpression(expression);
                    textField.setText(Double.toString(result));
                } catch (ArithmeticException e) {
                    textField.setText("������");
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат данных");//не является целым числом
                }
            }
        });
        buttonEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(textField.getText() + ".");
            }
        });


        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMinus);
        panel.add(button0);
        panel.add(buttonDot);
        panel.add(buttonEquals);
        panel.add(buttonPlus);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.add(textField, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(textPanel, BorderLayout.NORTH);

        frame.add(mainPanel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static double evaluateExpression(String expression) {
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    if (operand == 0) {
                        throw new ArithmeticException();
                    }
                    result /= operand;
                    break;
            }
        }
        return result;
    }
}

