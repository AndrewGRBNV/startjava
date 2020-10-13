public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        String name = "Inna";
        String gender = "female";
        float height = 1.70f;

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        }

        if (gender == "female") {
            System.out.println("Пол - женский");
        }

        if (height < 1.80) {
            System.out.println("Рост ниже 170 см");
        } else {
            System.out.println("Рост выше 170 см");
        }

        if (name.charAt(0) == 'M') {
            System.out.println("Первая буква имени М");
        } else if (name.charAt(0) == 'I') {
            System.out.println("Первая буква имени I");
            } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}

//    ЕСЛИ(рост < 1.80) {
//        сообщение
//    } ИНАЧЕ {
//    сообщение
//}
//
//    ЕСЛИ(перваяБукваИмени == ‘M’) {
//        сообщение
//    } ИНАЧЕ ЕСЛИ(перваяБукваИмени == ‘I’) {
//    сообщение
//} ИНАЧЕ {
//    сообщение
//}