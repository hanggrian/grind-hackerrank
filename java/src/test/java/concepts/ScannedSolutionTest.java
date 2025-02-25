package concepts;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class ScannedSolutionTest {
    @Test
    public void test() {
        ScannedSolution solution = new ScannedSolution("1 2 3");
        assertThat(solution.scanner.next())
            .isEqualTo("1");
        assertThat(solution.scanner.next())
            .isEqualTo("2");
        assertThat(solution.scanner.next())
            .isEqualTo("3");
    }
}
