import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class WelcomeToJavaTest {
    @Test
    public void samples() {
        assertThat(new WelcomeToJava().getResult())
            .isEqualTo(
                "Hello, World.\n"
                    + "Hello, Java.\n"
            );
    }
}
