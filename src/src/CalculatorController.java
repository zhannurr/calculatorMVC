import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addOperationListener(new OperationListener());
    }

    class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = view.getFirstNumber();
                double secondNumber = view.getSecondNumber();
                double result = 0;

                switch (e.getActionCommand()) {
                    case "+":
                        result = model.add(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = model.subtract(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = model.multiply(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            view.setResult("error bro");
                            return;
                        }
                        result = model.divide(firstNumber, secondNumber);
                        break;
                }

                view.setResult(String.valueOf(result));

            } catch (NumberFormatException ex) {
                view.showError("error minus aura");
            }
        }
    }
}
