public class Scene {
    protected String description;
    protected String smell;
    protected String feeling;
    protected Action[] actions;

    public Scene(String description, String smell, String feeling, Action[] actions) {
        this.description = description;
        this.smell = smell;
        this.feeling = feeling;
        this.actions = actions;
    }
}
