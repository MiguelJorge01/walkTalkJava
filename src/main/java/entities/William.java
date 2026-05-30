package entities;

public class William extends Character {

    public William(String name, String region, String race, int age) {
        super(name, region, race, age);
    }

    @Override
    public void introduceChar() {
        System.out.println(
            "\n[" + this.name + "]:" +
            "\nOlá, tudo bem? Meu nome é " + this.name + ", sou de " + this.region + "!");
    }
}
