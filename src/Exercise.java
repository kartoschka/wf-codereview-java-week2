public class Exercise {
    public String name;
    public String description;
    public int duration;
    public String position; // floor, standing

    public Exercise(String name, String description, int duration, String position) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String toString() {
        return String.format(
                "%s   DURATION: %d.\n--------------------------------------------------------\nDESCRIPTION: %s",
                name, duration, description
        );
    }
}
