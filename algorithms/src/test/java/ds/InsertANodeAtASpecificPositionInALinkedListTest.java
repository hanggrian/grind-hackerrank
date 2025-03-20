package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class InsertANodeAtASpecificPositionInALinkedListTest {
    @Test
    public void edgeCases() {
        assertThat(
            InsertANodeAtASpecificPositionInALinkedList.insertNodeAtPosition(null, null, 0)
        ).isNull();
        assertThat(
            InsertANodeAtASpecificPositionInALinkedList.insertNodeAtPosition(
                SinglyListNode.ZERO,
                null,
                -1
            )
        ).isNull();
    }

    @Test
    public void example() {
        assertIs(SinglyListNode.of(1, 2, 3), 4, 2, SinglyListNode.of(1, 2, 4, 3));
    }

    @Test
    public void testCase0() {
        assertIs(SinglyListNode.of(16, 13, 7), 1, 2, SinglyListNode.of(16, 13, 1, 7));
    }

    @Test
    public void testCase1() {
        assertIs(
            SinglyListNode.of(11, 9, 19, 10, 4),
            20,
            3,
            SinglyListNode.of(11, 9, 19, 20, 10, 4)
        );
    }

    private static void assertIs(
        final SinglyListNode llist,
        final Integer data,
        final int position,
        final SinglyListNode result
    ) {
        assertThat(
            InsertANodeAtASpecificPositionInALinkedList.insertNodeAtPosition(llist, data, position)
        ).isEqualTo(result);
    }
}
