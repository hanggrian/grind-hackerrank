import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public final class JavaLoops1Test {
    @Test
    public void samples() {
        String s = "2";
        assertWithMessage(s)
            .that(new JavaLoops1(s).getResult())
            .isEqualTo(
                "2 x 1 = 2\n"
                    + "2 x 2 = 4\n"
                    + "2 x 3 = 6\n"
                    + "2 x 4 = 8\n"
                    + "2 x 5 = 10\n"
                    + "2 x 6 = 12\n"
                    + "2 x 7 = 14\n"
                    + "2 x 8 = 16\n"
                    + "2 x 9 = 18\n"
                    + "2 x 10 = 20\n"
            );
    }
}
