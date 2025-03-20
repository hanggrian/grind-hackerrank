package ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SparseArraysTest {
    @Test
    public void edgeCases() {
        assertThat(SparseArrays.matchingStrings(null, null))
            .isEmpty();
        assertThat(SparseArrays.matchingStrings(Collections.emptyList(), Collections.emptyList()))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(Arrays.asList("ab", "ab", "abc"), Arrays.asList("ab", "abc", "bc"), 2, 1, 0);
    }

    @Test
    public void testCase10() {
        assertIn(
            Arrays.asList("aba", "baba", "aba", "xzxb"),
            Arrays.asList("aba", "xzxb", "ab"),
            2,
            1,
            0
        );
    }

    @Test
    public void testCase11() {
        assertIn(
            Arrays.asList("def", "de", "fgh"),
            Arrays.asList("de", "lmn", "fgh"),
            1,
            0,
            1
        );
    }

    @Test
    public void testCase12() {
        assertIn(
            Arrays.asList(
                "abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "na",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf"
            ),
            Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn"),
            1,
            3,
            4,
            3,
            2
        );
    }

    private static void assertIn(
        final List<String> stringList,
        final List<String> queries,
        final int... results
    ) {
        assertThat(SparseArrays.matchingStrings(stringList, queries))
            .containsExactlyElementsIn(Arrays.stream(results).boxed().collect(Collectors.toList()))
            .inOrder();
    }
}
