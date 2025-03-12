import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class StaircaseTest {
    @Test
    public void samples() {
        assertThat(Staircase.staircase(4))
            .containsExactly(
                "   #",
                "  ##",
                " ###",
                "####"
            )
            .inOrder();

        assertThat(Staircase.staircase(6))
            .containsExactly(
                "     #",
                "    ##",
                "   ###",
                "  ####",
                " #####",
                "######"
            )
            .inOrder();
    }
}
