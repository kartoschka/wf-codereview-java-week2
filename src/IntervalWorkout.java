class IntervalWorkout {
    private final static int PRT_WIDTH = 50;

    private Exercise[] setSequence;
    private int breakTime;
    private int numberOfSets;

    IntervalWorkout(Exercise[] sequence, int breakTime, int numberOfSets) {
        this.setSequence = sequence;
        this.breakTime = breakTime;
        this.numberOfSets = numberOfSets;
    }

    String formatProtocol() {
        StringBuilder result = new StringBuilder("*".repeat(PRT_WIDTH) + "\n");
        result.append(String.format("%" + PRT_WIDTH / 2 + "s%-" + PRT_WIDTH / 2 + "s\n",
                "SUPER AMAZING ", "WORKOUT SHEET"));
        result.append("*".repeat(PRT_WIDTH)).append("\n");

        for (int i = 1; i <= numberOfSets; i++) {
            result.append("=".repeat(PRT_WIDTH)).append("\n");
            result.append(String.format("ROUND %d:\n", i));

            for (Exercise x : setSequence) result.append(x.name).append("\n");

            if(!(i == numberOfSets)) {
                result.append("=".repeat(PRT_WIDTH)).append("\n");
                result.append(String.format("BRRRRRREAKKK (%d SECONDS)\n", breakTime));
            }
        }

        result.append("\n\n");
        result.append("*".repeat(PRT_WIDTH)).append("\n");
        result.append(String.format("%" + PRT_WIDTH / 2 + "s%-" + PRT_WIDTH / 2 + "s\n", "CONGRATZ ", "U R DONE!!!"));
        result.append("*".repeat(PRT_WIDTH));

        return result.toString();
    }
}
