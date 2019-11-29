public class Exercise {
    String name;
    private String description;
    int duration;
    Position position; // floor, standing

    Exercise(String name, String description, int duration, Position position) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String toString() {
        return String.format(
                "%-34sDURATION: %3d s.\n%s\nDESCRIPTION: %s",
                name, duration, "-".repeat(50), description
        );
    }
}
