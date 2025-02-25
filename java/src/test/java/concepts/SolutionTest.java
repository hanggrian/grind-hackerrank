package concepts;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        solution.println(1);
        solution.println('2');
        solution.println("%s", "3");
        assertThat(solution.prints)
            .containsExactly(
                "1",
                "2",
                "3"
            );
    }
}
