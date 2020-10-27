public class Calculator_2 {

    private double calculate(double num1, double num2, char operation) {
        switch (operation) {
            case '+': return add(num1, num2);
            case '-': return sub(num1, num2);
            case '*': return mul(num1, num2);
            case '/': return div(num1, num2);
            case '^': return power(num1, num2);
            default: return rem(num1, num2);
        }
    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }

    private double power(double num1, double num2) {
        if (num2 == (int)num2 && 0 < num2) {  // введённое число натуральное
            int pow = 0;
            double result = 1;
            for (pow = 0; pow < num2; pow++) {
                result *= num1;
            }
            return result;
        } else {
            System.out.println("Степень должна быть целым числом");
            return Double.NaN;
        }
    }

    private double rem(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 % num2;
        }
    }

    public double runCalculator() {
        double num1 = CalculatorTest.inputNumber();
        char operation = CalculatorTest.inputOperation();
        double num2 = CalculatorTest.inputNumber();
        double result = calculate(num1, num2, operation);
        return result;
    }

}