package ds;

import java.util.List;

final class TwoDArrayDs {
    private TwoDArrayDs() {}

    static int hourglassSum(final List<List<Integer>> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }
        final int rows = arr.size();
        final int cols = arr.get(0).size();
        if (rows < 3 || cols < 3) {
            return 0;
        }
        int hourglassSum = Integer.MIN_VALUE;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                hourglassSum =
                    Math.max(
                        hourglassSum,
                        arr.get(i).get(j)
                            + arr.get(i).get(j + 1)
                            + arr.get(i).get(j + 2)
                            + arr.get(i + 1).get(j + 1)
                            + arr.get(i + 2).get(j)
                            + arr.get(i + 2).get(j + 1)
                            + arr.get(i + 2).get(j + 2)
                    );
            }
        }
        return hourglassSum;
    }
}
