package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class GetNodeValueTest {
    @Test
    public void edgeCases() {
        assertThat(GetNodeValue.getNode(null, 0))
            .isEqualTo(0);
        assertThat(GetNodeValue.getNode(SinglyListNode.ZERO, -1))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(SinglyListNode.of(3, 2, 1, 0), 2, 2);
    }

    @Test
    public void testCase0() {
        assertIs(SinglyListNode.of(1), 0, 1);
        assertIs(SinglyListNode.of(3, 2, 1), 2, 3);
    }

    @Test
    public void testCase1() {
        assertIs(SinglyListNode.of(4, 3, 2, 1), 2, 3);
    }

    private static void assertIs(
        final SinglyListNode llist,
        final int positionFromTail,
        final int result
    ) {
        assertThat(GetNodeValue.getNode(llist, positionFromTail))
            .isEqualTo(result);
    }
}
