package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class PrintInReverseTest {
    @Test
    public void edgeCases() {
        assertThat(PrintInReverse.reversePrint(null))
            .isEmpty();
    }

    @Test
    public void example() {
        assertIn(SinglyListNode.of(1, 2, 3), "3", "2", "1");
    }

    @Test
    public void testCase0() {
        assertIn(SinglyListNode.of(16, 12, 4, 2, 5), "5", "2", "4", "12", "16");
        assertIn(SinglyListNode.of(7, 3, 9), "9", "3", "7");
        assertIn(SinglyListNode.of(5, 1, 18, 3, 13), "13", "3", "18", "1", "5");
    }

    @Test
    public void testCase1() {
        assertIn(SinglyListNode.of(11, 1, 7), "7", "1", "11");
        assertIn(SinglyListNode.of(12, 11, 15), "15", "11", "12");
        assertIn(SinglyListNode.of(5, 7, 15, 14), "14", "15", "7", "5");
    }

    private static void assertIn(final SinglyListNode node, final String... results) {
        assertThat(PrintInReverse.reversePrint(node))
            .containsExactlyElementsIn(results)
            .inOrder();
    }
}
