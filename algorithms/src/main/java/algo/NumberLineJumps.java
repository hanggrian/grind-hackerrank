package algo;

final class NumberLineJumps {
    private NumberLineJumps() {}

    static boolean kangaroo(
        final int x1,
        final int v1,
        final int x2,
        final int v2
    ) {
        return v1 > v2
            && (x2 - x1) % (v1 - v2) == 0;
    }
}
