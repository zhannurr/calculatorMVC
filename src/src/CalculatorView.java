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
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("First Number:"));
        add(firstNumberField);
        add(new JLabel("Second Number:"));
        add(secondNumberField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        add(buttonPanel);

        add(resultLabel);

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
