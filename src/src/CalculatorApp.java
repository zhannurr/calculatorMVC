// Главный класс приложения калькулятора
public class CalculatorApp {
    public static void main(String[] args) {
        // Создаем экземпляр модели, которая содержит бизнес-логику вычислений
        CalculatorModel model = new CalculatorModel();

        // Создаем экземпляр представления, которое отвечает за интерфейс пользователя
        CalculatorView view = new CalculatorView();

        // Создаем экземпляр контроллера, который связывает модель и представление
        CalculatorController controller = new CalculatorController(model, view);

        // При инициализации контроллера автоматически устанавливается слушатель событий
        // для кнопок в представлении, что позволяет пользователю взаимодействовать с калькулятором.
    }
}
