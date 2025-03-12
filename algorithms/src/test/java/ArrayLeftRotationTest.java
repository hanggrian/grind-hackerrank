import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class ArrayLeftRotationTest {
    @Test
    public void edgeCases() {
        assertThat(ArrayLeftRotation.rotateLeft(0, null))
            .isNull();
        assertThat(ArrayLeftRotation.rotateLeft(1, Collections.emptyList()))
            .isNull();
        assertThat(ArrayLeftRotation.rotateLeft(0, Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void samples() {
        assertThat(ArrayLeftRotation.rotateLeft(2, Arrays.asList(1, 2, 3, 4, 5)))
            .containsExactly(3, 4, 5, 1, 2)
            .inOrder();

        assertThat(ArrayLeftRotation.rotateLeft(4, Arrays.asList(1, 2, 3, 4, 5)))
            .containsExactly(5, 1, 2, 3, 4)
            .inOrder();
    }
}
