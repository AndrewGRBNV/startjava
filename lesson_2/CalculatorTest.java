public class CalculatorTest {
    public static void main(String[] args) {
        boolean runCalculator = true;
        Calculator_2 calc = new Calculator_2();
        do {
            double num1 = calc.inputNumber();
            char operation = calc.inputOperation();
            double num2 = calc.inputNumber();
            double result = calc.calculation(num1, num2, operation);
            System.out.println("Результат равен " + result);
            runCalculator = calc.inputYesNo();
        } while (runCalculator);
    }
}
