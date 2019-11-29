import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Exercise[] xs = build_exercise_objects();
        printHeadline("print all exercise objects");
        printAll(xs);

        printHeadline("print only exercises on the floor");
        printOnlyFloor(xs);

        printHeadline("print only floor exercises over (not equal) 1 minute");
        printOnlyFloorAndOver1min(xs);

        printHeadline("generate interval workout sheet");
        printIntervalWorkout(xs);
    }

    private static void printHeadline(String text) {
        System.out.println();
        System.out.println("     " + text.toUpperCase());
        System.out.println();
    }

    private static void printIntervalWorkout(Exercise[] xs) {
        Exercise[] exampleSubset = {xs[0], xs[2], xs[1]};
        IntervalWorkout workout = new IntervalWorkout(exampleSubset, 30, 4);
        System.out.println(workout.formatProtocol());
    }

    private static void printAll(Exercise[] xs) {
        printWithPredicate(xs, x -> true);
    }

    private static void printOnlyFloor(Exercise[] xs) {
        printWithPredicate(xs, x -> x.position == Position.FLOOR);
    }

    private static void printOnlyFloorAndOver1min(Exercise[] xs) {
        printWithPredicate(xs, x -> x.position == Position.FLOOR && x.duration > 60);
    }

    private static void printWithPredicate(Exercise[] xs, Function<Exercise, Boolean> predicate) {
        for (Exercise x : xs) {
            if (predicate.apply(x)) {
                System.out.println(x);
                System.out.println();
            }
        }
    }

    private static Exercise[] build_exercise_objects() {
        Exercise[] xs = new Exercise[6];
        for (int i = 0; i < 6; i++) {
            xs[i] = new Exercise(DATA.EXERCISE_NAMES[i], DATA.EXERCISE_DESCRIPTIONS[i], DATA.EXERCISE_DURATIONS[i], DATA.EXERCISE_POSITIONS[i]);
        }
        return xs;
    }
}
