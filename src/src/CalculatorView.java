import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// Класс представления калькулятора, наследующий JFrame
public class CalculatorView extends JFrame {
    // Поля для ввода чисел
    private final JTextField firstNumberField = new JTextField(10); // Поле для первого числа
    private final JTextField secondNumberField = new JTextField(10); // Поле для второго числа

    // Кнопки для операций
    final JButton addButton = new JButton("+"); // Кнопка для сложения
    final JButton subtractButton = new JButton("-"); // Кнопка для вычитания
    final JButton multiplyButton = new JButton("*"); // Кнопка для умножения
    final JButton divideButton = new JButton("/"); // Кнопка для деления


    // Метки и результат
    private final JLabel resultLabel = new JLabel("Result: "); // Метка для отображения результата
    private final JLabel firstNumberLabel = new JLabel("First Number:"); // Метка для первого числа
    private final JLabel secondNumberLabel = new JLabel("Second Number:"); // Метка для второго числа

    // Конструктор класса
    public CalculatorView() {
        // Устанавливаем заголовок окна
        setTitle("Calculator");
        // Завершаем приложение при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Устанавливаем размер окна
        setSize(600, 400);
        // Устанавливаем менеджер компоновки
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); // Объект для настройки размещения компонентов
        gbc.fill = GridBagConstraints.HORIZONTAL; // Заполняем компоненты по горизонтали
        gbc.insets = new Insets(5, 5, 5, 5); // Отступы между компонентами

        // Установка шрифтов для меток и результатов
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        firstNumberLabel.setFont(labelFont);
        secondNumberLabel.setFont(labelFont);
        resultLabel.setFont(labelFont);

        // Установка шрифтов для полей ввода
        Font fieldFont = new Font("Arial", Font.PLAIN, 20);
        firstNumberField.setFont(fieldFont);
        secondNumberField.setFont(fieldFont);

        // Установка шрифтов для кнопок
        Font buttonFont = new Font("Arial", Font.PLAIN, 20);
        addButton.setFont(buttonFont);
        subtractButton.setFont(buttonFont);
        multiplyButton.setFont(buttonFont);
        divideButton.setFont(buttonFont);

        // Установка размеров кнопок
        Dimension buttonSize = new Dimension(60, 30); // Размеры кнопок
        addButton.setPreferredSize(buttonSize);
        subtractButton.setPreferredSize(buttonSize);
        multiplyButton.setPreferredSize(buttonSize);
        divideButton.setPreferredSize(buttonSize);

        // Установка цвета фона окна
        getContentPane().setBackground(new Color(198, 235, 239));

        // Установка цвета кнопок
        Color buttonColor = new Color(255, 174, 223);
        addButton.setBackground(buttonColor);
        subtractButton.setBackground(buttonColor);
        multiplyButton.setBackground(buttonColor);
        divideButton.setBackground(buttonColor);

        // Установка цвета полей ввода
        Color fieldColor = new Color(255, 238, 156);
        firstNumberField.setBackground(fieldColor);
        secondNumberField.setBackground(fieldColor);

        // Добавление компонентов на форму с помощью GridBagLayout
        gbc.gridx = 0; gbc.gridy = 0; add(firstNumberLabel, gbc); // Первая метка
        gbc.gridx = 1; add(firstNumberField, gbc); // Первое поле ввода
        gbc.gridx = 0; gbc.gridy = 1; add(secondNumberLabel, gbc); // Вторая метка
        gbc.gridx = 1; add(secondNumberField, gbc); // Второе поле ввода

        // Создание панели для кнопок операций
        JPanel buttonPanel = new JPanel(new FlowLayout()); // Панель с компоновкой по потоку
        buttonPanel.add(addButton); // Кнопка сложения
        buttonPanel.add(subtractButton); // Кнопка вычитания
        buttonPanel.add(multiplyButton); // Кнопка умножения
        buttonPanel.add(divideButton); // Кнопка деления

        // Добавление панели с кнопками и метки результата на форму
        gbc.gridx = 0; gbc.gridy = 2; add(buttonPanel, gbc); // Панель с кнопками
        gbc.gridx = 1; add(resultLabel, gbc); // Метка для результата

        // Делаем окно видимым
        setVisible(true);
    }

    // Метод для получения первого числа из поля ввода
    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText()); // Парсим текст в double
    }

    // Метод для получения второго числа из поля ввода
    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText()); // Парсим текст в double
    }

    // Метод для отображения результата на экране
    public void setResult(String result) {
        resultLabel.setText("Result: " + result); // Обновляем текст метки результата
    }

    // Метод для добавления обработчиков событий для кнопок операций
    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener); // Добавляем слушатель для кнопки сложения
        subtractButton.addActionListener(listener); // Добавляем слушатель для кнопки вычитания
        multiplyButton.addActionListener(listener); // Добавляем слушатель для кнопки умножения
        divideButton.addActionListener(listener); // Добавляем слушатель для кнопки деления
    }

    // Метод для отображения сообщения об ошибке
    public void showError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage); // Показать диалоговое окно с сообщением об ошибке
    }
}
