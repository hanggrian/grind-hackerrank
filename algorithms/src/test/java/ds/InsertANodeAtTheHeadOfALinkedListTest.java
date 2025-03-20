package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class InsertANodeAtTheHeadOfALinkedListTest {
    @Test
    public void edgeCases() {
        assertThat(InsertANodeAtTheHeadOfALinkedList.insertNodeAtHead(null, null))
            .isEqualTo(new SinglyListNode(null));
    }

    @Test
    public void testCase0() {
        assertIs(
            SinglyListNode.of(383, 484, 392, 975),
            321,
            SinglyListNode.of(321, 383, 484, 392, 975)
        );
    }

    @Test
    public void testCase1() {
        assertIs(
            SinglyListNode.of(321, 641, 654, 524, 952, 337, 955, 891, 590),
            133,
            SinglyListNode.of(133, 321, 641, 654, 524, 952, 337, 955, 891, 590)
        );
    }

    private static void assertIs(
        final SinglyListNode llist,
        final Integer data,
        final SinglyListNode result
    ) {
        assertThat(InsertANodeAtTheHeadOfALinkedList.insertNodeAtHead(llist, data))
            .isEqualTo(result);
    }
}
