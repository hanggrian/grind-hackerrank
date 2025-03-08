import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public class JavaLoops2Test {
    @Test
    public void test() {
        String s =
            "2\n"
                + "0 2 10\n"
                + "5 3 5";
        assertWithMessage(s)
            .that(new JavaLoops2(s).getResult())
            .isEqualTo(
                "2 6 14 30 62 126 254 510 1022 2046\n"
                    + "8 14 26 50 98\n"
            );
    }
}
