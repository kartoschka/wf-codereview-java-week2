public class Main {
    private static String[] EXERCISE_NAMES = {
            "Push-ups", "Planks", "Squats", "Backward Kicks", "Leg Curls", "Sideward Back Stretches"
    };

    private static String[] EXERCISE_DESCRIPTIONS = {
            "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",
            "",
            "",
            "",
            "",
            ""
    };

    private static int[] EXERCISE_DURATIONS = {
            0, 0, 0, 0, 0, 0
    };

    private static String[] EXERCISE_POSITIONS = {
            "", "", "", "", "", ""
    };

    public static void main(String[] args) {
        Exercise[] xs = build_exercise_objects();
    }

    private static void printAll(Exercise[] xs) {
        for (Exercise x : xs) {
            System.out.println(xs);
        }
    }

    private static void printOnlyFloor(Exercise[] xs) {
        for (Exercise x : xs) {
            if (x.position == "floor") {
                System.out.println(xs);
            }
        }
    }

    private static void printOnlyFloorAndOver1min(Exercise[] xs) {
        for (Exercise x : xs) {
            if (x.position == "floor" && x.duration > 60) {
                System.out.println(xs);
            }
        }
    }

    private static Exercise[] build_exercise_objects() {
        Exercise[] xs = new Exercise[6];
        for (int i = 0; i < 6; i++) {
            xs[i] = new Exercise(EXERCISE_NAMES[i], EXERCISE_DESCRIPTIONS[i], EXERCISE_DURATIONS[i], EXERCISE_POSITIONS[i]);
        }
        return xs;
    }
}
