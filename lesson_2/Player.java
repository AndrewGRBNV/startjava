public class Player {

    private String Name;
    private int number;

    public Player(String Name, int number) {
        this.Name = Name;
        this.number = number;
    }

    public Player() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
