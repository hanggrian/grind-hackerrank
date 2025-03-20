package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class ReverseALinkedListTest {
    @Test
    public void edgeCases() {
        assertThat(ReverseALinkedList.reverse(null))
            .isNull();
    }

    @Test
    public void example() {
        assertIs(SinglyListNode.of(1, 2, 3), SinglyListNode.of(3, 2, 1));
    }

    @Test
    public void testCase0() {
        assertIs(SinglyListNode.of(1, 2, 3, 4, 5), SinglyListNode.of(5, 4, 3, 2, 1));
    }

    @Test
    public void testCase1() {
        assertIs(SinglyListNode.of(3, 4, 2, 5), SinglyListNode.of(5, 2, 4, 3));
    }

    private static void assertIs(final SinglyListNode llist, final SinglyListNode result) {
        assertThat(ReverseALinkedList.reverse(llist))
            .isEqualTo(result);
    }
}
