import java.util.List;

final class AVeryBigSum {
    private AVeryBigSum() {}

    static long aVeryBigSum(final List<Long> ar) {
        if (ar == null) {
            return 0L;
        }
        return ar.stream().mapToLong(Long::longValue).sum();
    }
}
