import java.util.List;

final class DiagonalDifference {
    private DiagonalDifference() {}

    static int diagonalDifference(final List<List<Integer>> arr) {
        if (arr == null || arr.isEmpty() || arr.size() != arr.get(0).size()) {
            return 0;
        }
        int ltr = 0;
        int rtl = 0;
        int i = 0;
        int j = arr.size() - 1;
        while (i < arr.size()) {
            ltr += arr.get(i).get(i);
            rtl += arr.get(i).get(j);
            i++;
            j--;
        }
        return Math.abs(ltr - rtl);
    }
}
