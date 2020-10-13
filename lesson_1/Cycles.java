public class Cycles {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        int counter = 6;
        while (counter > -6) {
            System.out.println(counter);
            counter -= 2;
        }

        counter = 10;
        int sum = 0;
        do {
            if (counter % 2 == 1) {
                sum += counter;
            }
            counter++;
        } while (counter < 20);
        System.out.println(sum);
    }
}
