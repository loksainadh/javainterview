public class ValleyCounter {
    public static int countValleys(String path) {
        int seaLevel = 0;
        int currentLevel = 0;
        int valleys = 0;

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                currentLevel++;
            } else if (step == 'D') {
                currentLevel--;
            }

            // A valley is completed when we return to sea level from below
            if (currentLevel == seaLevel && step == 'U') {
                valleys++;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        String path = "UDDDUDUU";  // Example input
        System.out.println("Number of valleys: " + countValleys(path));
    }
}
