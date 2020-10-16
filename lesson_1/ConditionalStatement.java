public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        char firstNameLetter = 'I';
        char gender = 'f';
        float height = 1.70f;

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        }

        if (gender == 'f') {
            System.out.println("Пол - женский");
        }

        if (height < 1.80) {
            System.out.println("Рост ниже 170 см");
        } else {
            System.out.println("Рост выше 170 см");
        }

        if (firstNameLetter == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}
