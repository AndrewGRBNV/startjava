public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfGarry = new Wolf();

        wolfGarry.setName("Garry");
        wolfGarry.setGender("Male"); 
        wolfGarry.setAge(9);
        wolfGarry.setColor("Gray");
        wolfGarry.setWeight(12);

        System.out.println("Name: " + wolfGarry.getName());
        System.out.println("Gender: " + wolfGarry.getGender());
        System.out.println("Age: " + wolfGarry.getAge());
        System.out.println("Color: " + wolfGarry.getColor());
        System.out.println("Weight: " + wolfGarry.getWeight());

        wolfGarry.go();
        wolfGarry.sit();
        wolfGarry.run();
        wolfGarry.talk();
        wolfGarry.hunt();
    }
}
