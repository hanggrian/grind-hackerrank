package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class CycleDetectionTest {
    @Test
    public void edgeCases() {
        assertThat(CycleDetection.hasCycle(null))
            .isFalse();
    }

    @Test
    public void example() {
        SinglyListNode node = SinglyListNode.of(1, 2, 3);
        node.next = node;
        assertIs(node, true);
    }

    @Test
    public void testCase0() {
        assertIs(SinglyListNode.of(-1, 1), false);
    }

    @Test
    public void testCase1() {
        SinglyListNode node = SinglyListNode.of(3, 1, 2);
        node.next = node;
        assertIs(node, true);
    }

    private static void assertIs(final SinglyListNode head, final boolean result) {
        assertThat(CycleDetection.hasCycle(head))
            .isEqualTo(result);
    }
}
