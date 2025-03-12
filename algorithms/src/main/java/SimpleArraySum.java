import java.util.List;

final class SimpleArraySum {
    private SimpleArraySum() {}

    static int simpleArraySum(final List<Integer> ar) {
        if (ar == null) {
            return 0;
        }
        return ar.stream().mapToInt(Integer::intValue).sum();
    }
}
