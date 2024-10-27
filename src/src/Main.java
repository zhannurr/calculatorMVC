
public class Main {

        public static void main(String[] args) {
            // Создание экземпляров модели, представления и контроллера
            CalculatorModel model = new CalculatorModel();
            CalculatorView view = new CalculatorView();
            CalculatorController controller = new CalculatorController(model, view);

            // Запуск приложения
            view.setVisible(true);
        }




}
