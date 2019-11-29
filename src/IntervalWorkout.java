import java.util.ArrayList;

public class IntervalWorkout {
    private static int PRT_WIDTH = 50;

    public Exercise[] setSequence;
    public int breakTime;
    public int numberOfSets;

    public IntervalWorkout(Exercise[] sequence, int breakTime, int numberOfSets) {
        this.setSequence = sequence;
        this.breakTime = breakTime;
        this.numberOfSets = numberOfSets;
    }

    public String formatProtocol() {
        String result = "*".repeat(PRT_WIDTH) + "\n";
        result += String.format("%" + PRT_WIDTH / 2 + "s%-" + PRT_WIDTH / 2 + "s\n",
                "SUPER AMAZING ", "WORKOUT SHEET");
        result += "*".repeat(PRT_WIDTH) + "\n";

        for (int i = 1; i <= numberOfSets; i++) {
            result += "=".repeat(PRT_WIDTH) + "\n";
            result += String.format("ROUND %d:\n", i);

            for (Exercise x : setSequence) result += x.name + "\n";

            if(!(i == numberOfSets)) {
                result += "=".repeat(PRT_WIDTH) + "\n";
                result += String.format("BRRRRRREAKKK (%d SECONDS)\n", breakTime);
            }
        }

        result += "\n\n";
        result += "*".repeat(PRT_WIDTH) + "\n";
        result += String.format("%" + PRT_WIDTH / 2 + "s%-" + PRT_WIDTH / 2 + "s\n", "CONGRATZ ", "U R DONE!!!");
        result += "*".repeat(PRT_WIDTH);

        return result;
    }
}
