import java.util.Scanner;

public class Calculator_2 {

    public double inputNumber() {
        System.out.print("Введите число ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        }
        System.out.println("Число введено не корректно, введите число ");
        return inputNumber();
    }

    public char inputOperation() {
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

    public double calculation(double num1, double num2, char operation) {
        switch (operation) {
            case '+': return add(num1, num2);
            case '-': return sub(num1, num2);
            case '*': return mul(num1, num2);
            case '/': return div(num1, num2);
            case '^': return power(num1, num2);
            default: return rem(num1, num2);
        }
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }

    public double power(double num1, double num2) {
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

    public double rem(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 % num2;
        }
    }

    public boolean inputYesNo() {
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
}