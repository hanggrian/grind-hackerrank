import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class WelcomeToJavaTest {
    @Test
    public void test() {
        assertThat(new WelcomeToJava().prints)
            .containsExactly(
                "Hello, World.",
                "Hello, Java."
            );
    }
}
