import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean runCalculator = true;
        Calculator_2 calc = new Calculator_2();
        do {
            System.out.println("Результат равен " + calc.runCalculator());
            runCalculator = inputYesNo();
        } while (runCalculator);
    }

    private static boolean inputYesNo() {
        System.out.println("Хотите продолжить? да / нет");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            switch (scan.next()) {
                case "да":
                    return true;
                case "нет":
                    return false;
                default:
                    return inputYesNo();
            }
        }
        return inputYesNo();
    }

    public static double inputNumber() {
        System.out.print("Введите число ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        }
        System.out.println("Число введено не корректно, введите число ");
        return inputNumber();
    }

    public static char inputOperation() {
        System.out.println("Введите действие:");
        System.out.println("+ Сложение");
        System.out.println("- Вычитание ");
        System.out.println("* Умножение ");
        System.out.println("/ Деление");
        System.out.println("^ Возведение в степень");
        System.out.println("% Остаток от деления");
        Scanner scan = new Scanner(System.in);
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '^' || operation == '%') {
                return operation;
            }
            System.out.println("Вы ввели не правильную операцию, введите заново");
            return inputOperation();
        }
        System.out.println("Вы ввели не правильную операцию, введите ");
        return inputOperation();
    }
}
