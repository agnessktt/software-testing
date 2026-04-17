public class NumberClassifier {

    public static String classify(int[] numbers) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : numbers) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        if (positive > negative) {
            return "More positives";
        } else if (negative > positive) {
            return "More negatives";
        } else if (zero > 0) {
            return "Contains zero";
        } else {
            return "Equal positives and negatives";
        }
    }
}