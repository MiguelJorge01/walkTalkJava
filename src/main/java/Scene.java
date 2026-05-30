public class Scene {
    public String description;
    public String smell;
    public String feeling;
    public Action[] actions;

    public Scene(String description, String smell, String feeling, Action[] actions) {
        this.description = description;
        this.smell = smell;
        this.feeling = feeling;
        this.actions = actions;
    }
}
