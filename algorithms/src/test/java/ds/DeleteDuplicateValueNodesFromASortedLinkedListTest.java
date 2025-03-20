package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DeleteDuplicateValueNodesFromASortedLinkedListTest {
    @Test
    public void edgeCases() {
        assertThat(DeleteDuplicateValueNodesFromASortedLinkedList.removeDuplicates(null))
            .isNull();
    }

    @Test
    public void example() {
        assertIs(SinglyListNode.of(1, 2, 2, 3, 3, 3, 3), SinglyListNode.of(1, 2, 3));
    }

    @Test
    public void testCase0() {
        assertIs(SinglyListNode.of(5, 1, 2, 2, 3, 4), SinglyListNode.of(5, 1, 2, 3, 4));
    }

    @Test
    public void testCase1() {
        assertIs(SinglyListNode.of(6, 3, 3, 3, 4, 5, 5), SinglyListNode.of(6, 3, 4, 5));
    }

    private static void assertIs(
        final SinglyListNode llist,
        final SinglyListNode result
    ) {
        assertThat(DeleteDuplicateValueNodesFromASortedLinkedList.removeDuplicates(llist))
            .isEqualTo(result);
    }
}
