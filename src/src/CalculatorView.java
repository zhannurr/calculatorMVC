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

    public CalculatorView() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.insets = new Insets(5, 5, 5, 5);

        // Первая строка - Первый номер
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("First Number:"), gbc);

        gbc.gridx = 1;
        add(firstNumberField, gbc);

        // Вторая строка - Второй номер
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Second Number:"), gbc);

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
