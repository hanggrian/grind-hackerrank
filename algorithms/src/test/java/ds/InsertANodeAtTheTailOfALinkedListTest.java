package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class InsertANodeAtTheTailOfALinkedListTest {
    @Test
    public void edgeCases() {
        assertThat(InsertANodeAtTheTailOfALinkedList.insertNodeAtTail(null, null))
            .isEqualTo(new SinglyListNode(null));
    }

    @Test
    public void testCase0() {
        assertIs(
            SinglyListNode.of(141, 302, 164, 530, 474),
            SinglyListNode.of(141, 302, 164, 530, 474, null)
        );
    }

    @Test
    public void testCase1() {
        assertIs(
            SinglyListNode.of(236, 326, 937),
            SinglyListNode.of(236, 326, 937, null)
        );
    }

    private static void assertIs(final SinglyListNode head, final SinglyListNode result) {
        assertThat(InsertANodeAtTheTailOfALinkedList.insertNodeAtTail(head, null))
            .isEqualTo(result);
    }
}
