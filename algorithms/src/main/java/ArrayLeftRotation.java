import java.util.ArrayList;
import java.util.List;

final class ArrayLeftRotation {
    private ArrayLeftRotation() {}

    static List<Integer> rotateLeft(final int d, final List<Integer> arr) {
        if (arr == null || d > arr.size()) {
            return null;
        }
        final List<Integer> nums = new ArrayList<>(arr);
        final List<Integer> numsToRemove = new ArrayList<>(nums.subList(0, d));
        nums.removeAll(numsToRemove);
        nums.addAll(numsToRemove);
        return nums;
    }
}
