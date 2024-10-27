import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private final JTextField firstNumberField = new JTextField(10);
    private final JTextField secondNumberField = new JTextField(10);
    private final JButton addButton = new JButton("+");
    private final JButton subtractButton = new JButton("-");
    private final JButton multiplyButton = new JButton("*");
    private final JButton divideButton = new JButton("/");
    private final JLabel resultLabel = new JLabel("Result: ");
    private final JLabel firstNumberLabel = new JLabel("First Number:");
    private final JLabel secondNumberLabel = new JLabel("Second Number:");

    public CalculatorView() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Настройка шрифтов для меток
        Font labelFont = new Font("Arial", Font.BOLD, 20);  // Изменение шрифта для меток
        firstNumberLabel.setFont(labelFont);
        secondNumberLabel.setFont(labelFont);
        resultLabel.setFont(labelFont);

        // Настройка шрифтов для полей ввода и кнопок
        Font fieldFont = new Font("Arial", Font.PLAIN, 20);
        firstNumberField.setFont(fieldFont);
        secondNumberField.setFont(fieldFont);

        Font buttonFont = new Font("Arial", Font.PLAIN, 20);
        addButton.setFont(buttonFont);
        subtractButton.setFont(buttonFont);
        multiplyButton.setFont(buttonFont);
        divideButton.setFont(buttonFont);

        // Установка предпочтительных размеров кнопок
        Dimension buttonSize = new Dimension(60, 30);
        addButton.setPreferredSize(buttonSize);
        subtractButton.setPreferredSize(buttonSize);
        multiplyButton.setPreferredSize(buttonSize);
        divideButton.setPreferredSize(buttonSize);

        // Изменение цвета фона и текста
        Color buttonColor = new Color(255, 174, 223); // Цвет кнопок
        Color fieldColor = new Color(255, 238, 156, 255); // Цвет полей ввода
        Color labelColor = Color.BLACK; // Цвет текста меток


        // Изменение фона окна
        getContentPane().setBackground(new Color(198, 235, 239)); // Установите нужный цвет фона


        addButton.setBackground(buttonColor);
        subtractButton.setBackground(buttonColor);
        multiplyButton.setBackground(buttonColor);
        divideButton.setBackground(buttonColor);


        firstNumberField.setBackground(fieldColor);
        secondNumberField.setBackground(fieldColor);
        firstNumberField.setForeground(labelColor);
        secondNumberField.setForeground(labelColor);

        // Первая строка - Первый номер
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(firstNumberLabel, gbc); // Добавление метки

        gbc.gridx = 1;
        add(firstNumberField, gbc);

        // Вторая строка - Второй номер
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(secondNumberLabel, gbc); // Добавление метки

        gbc.gridx = 1;
        add(secondNumberField, gbc);

        // Третья строка - Кнопки и результат
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(buttonPanel, gbc);

        gbc.gridx = 1;
        add(resultLabel, gbc);

        // Делаем окно видимым
        setVisible(true);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText());
    }

    public void setResult(String result) {
        resultLabel.setText("Result: " + result);
    }

    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }

    public void showError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
