import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public final class JavaStdinStdout1Test {
    @Test
    public void samples() {
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
