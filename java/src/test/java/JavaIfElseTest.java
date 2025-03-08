import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public class JavaIfElseTest {
    @Test
    public void test() {
        String s = "3";
        assertWithMessage(s)
            .that(new JavaIfElse(s).getResult())
            .isEqualTo("Weird\n");

        s = "24";
        assertWithMessage(s)
            .that(new JavaIfElse(s).getResult())
            .isEqualTo("Not Weird\n");
    }
}
