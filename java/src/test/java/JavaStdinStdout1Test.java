import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public class JavaStdinStdout1Test {
    @Test
    public void test() {
        String s =
            "42\n"
                + "100\n"
                + "125";
        assertWithMessage(s)
            .that(new JavaStdinStdout1(s).getResult())
            .isEqualTo(
                "42\n"
                    + "100\n"
                    + "125\n"
            );
    }
}
