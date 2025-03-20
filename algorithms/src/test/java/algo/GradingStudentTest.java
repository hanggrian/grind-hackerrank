package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class GradingStudentTest {
    @Test
    public void edgeCases() {
        assertThat(GradingStudents.gradingStudents(null))
            .isEmpty();
        assertThat(GradingStudents.gradingStudents(Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(Arrays.asList(84, 29, 57), Arrays.asList(85, 29, 57));
    }

    @Test
    public void testCase0() {
        assertIn(Arrays.asList(73, 67, 38, 33), Arrays.asList(75, 67, 40, 33));
    }

    private static void assertIn(final List<Integer> grades, final List<Integer> results) {
        assertThat(GradingStudents.gradingStudents(grades))
            .containsExactlyElementsIn(results)
            .inOrder();
    }
}
