package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DeleteANodeTest {
    @Test
    public void edgeCases() {
        assertThat(DeleteANode.deleteNode(null, 0))
            .isNull();
        assertThat(DeleteANode.deleteNode(SinglyListNode.ZERO, -1))
            .isNull();
    }

    @Test
    public void example() {
        assertIs(SinglyListNode.of(0, 1, 2, 3), 2, SinglyListNode.of(0, 1, 3));
    }

    @Test
    public void testCase0() {
        assertIs(
            SinglyListNode.of(20, 6, 2, 19, 7, 4, 15, 9),
            3,
            SinglyListNode.of(20, 6, 2, 7, 4, 15, 9)
        );
    }

    @Test
    public void testCase1() {
        assertIs(SinglyListNode.of(11, 9, 2, 9), 1, SinglyListNode.of(11, 2, 9));
    }

    private static void assertIs(
        final SinglyListNode llist,
        final int position,
        final SinglyListNode result
    ) {
        assertThat(DeleteANode.deleteNode(llist, position))
            .isEqualTo(result);
    }
}
