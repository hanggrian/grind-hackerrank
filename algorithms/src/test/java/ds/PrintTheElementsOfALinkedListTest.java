package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class PrintTheElementsOfALinkedListTest {
    @Test
    public void edgeCases() {
        assertThat(PrintTheElementsOfALinkedList.printLinkedList(null))
            .isEmpty();
    }

    @Test
    public void testCase0() {
        assertIn(
            SinglyListNode.of(16, 13),
            "16",
            "13"
        );
    }

    @Test
    public void testCase1() {
        assertIn(
            SinglyListNode.of(17, 19, 5, 12),
            "17",
            "19",
            "5",
            "12"
        );
    }

    private static void assertIn(
        final SinglyListNode head,
        final String... results
    ) {
        assertThat(PrintTheElementsOfALinkedList.printLinkedList(head))
            .containsExactlyElementsIn(results)
            .inOrder();
    }
}
