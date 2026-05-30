package entities;

public class Character {
    protected String name;
    protected String region;
    protected String race;
    protected int age;

    public Character(String name, String region, String race, int age) {
        this.name = name;
        this.region = region;
        this.race = race;
        this.age = age;
    }

    public void introduceChar() {
        System.out.println(
            "\n[" + this.name + "]:" +
            "\nOlá, meu nome é " + this.name + ", de " + this.region);
    }
}
