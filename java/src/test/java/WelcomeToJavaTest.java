import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class WelcomeToJavaTest {
    @Test
    public void test() {
        assertThat(new WelcomeToJava().getResult())
            .isEqualTo(
                "Hello, World.\n"
                    + "Hello, Java.\n"
            );
    }
}
