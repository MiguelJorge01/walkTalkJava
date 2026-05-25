public class Action {
    protected String name;
    protected Runnable effect;

    public Action(String name, Runnable effect) {
        this.name = name;
        this.effect = effect;
    }

    public void exec() {
        effect.run();
    }
}