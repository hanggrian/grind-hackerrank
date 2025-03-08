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
        assertThat(solution.getResult())
            .isEqualTo(
                "1\n"
                    + "2\n"
                    + "3\n"
            );
    }
}
