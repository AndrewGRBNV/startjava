public class CalculatorTest {
    public static void main(String[] args) {
        boolean runCalculator = true;
        do {
            double num1 = Calculator_2.inputNumber();
            char operation = Calculator_2.inputOperation();
            double num2 = Calculator_2.inputNumber();
            double result = Calculator_2.calculation(num1, num2, operation);
            System.out.println("Результат равен " + result);
            runCalculator = Calculator_2.inputYesNo();
        } while (runCalculator);
    }
}
