public class CalculatorTest {
    public static void main(String[] args) {
        boolean runCalculator = true;
        Calculator_2 calc = new Calculator_2();
        do {
            System.out.println("Результат равен " + calc.runCalculator());
            runCalculator = calc.inputYesNo();
        } while (runCalculator);
    }
}
