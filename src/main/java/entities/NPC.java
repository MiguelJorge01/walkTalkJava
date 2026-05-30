package entities;

public class NPC extends Character {
    public enum Mood {
        KIND, ANGRY, SAD, CURIOUS
    }

    protected Mood mood;

    public NPC(String name, String region, String race, int age, Mood mood) {
        super(name, region, race, age);
        this.mood = mood;
    }

    public void introduceChar() {
        String apresentacao;

        switch (this.mood) {
            case KIND:
                apresentacao =
                    "\n[" + this.name + "]:" +
                    "\nOlá, jovem! Como vai? Meu nome é " + this.name + ", de " + this.region;
                break;
            case ANGRY:
                apresentacao =
                    "\n[" + this.name + "]:" +
                    "\nO que você quer?";
                break;
            case SAD:
                apresentacao =
                    "\n[" + this.name + "]:" +
                    "\nOlá...";
                break;
            case CURIOUS:
                apresentacao =
                    "\n[" + this.name + "]:" +
                    "\nOlá, quem é você?";
                break;
            default:
                apresentacao =
                    "\n[" + this.name + "]:" +
                    "\nOlá";
                break;
        }

        System.out.println(apresentacao);
    }
}
