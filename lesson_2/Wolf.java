public class Wolf {
    private String gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    public void go() {
        System.out.print("Going...\n");
    }

    public void sit() {
        System.out.print("Siting...\n"); }

    public void  run() {
        System.out.print("Run...\n");
    }

    public void talk() {
        System.out.print("Talking...\n");
    }

    public void  hunt() {
        System.out.print("Hunting...\n");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}