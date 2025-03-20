package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class CompareTwoLinkedListsTest {
    @Test
    public void edgeCases() {
        assertThat(CompareTwoLinkedLists.compareLists(null, null))
            .isTrue();
    }

    @Test
    public void example() {
        assertIs(SinglyListNode.of(1, 2, 3), SinglyListNode.of(1, 2, 3, 4), false);
    }

    @Test
    public void testCase0() {
        assertIs(SinglyListNode.of(1, 2), SinglyListNode.of(1), false);
        assertIs(SinglyListNode.of(1, 2), SinglyListNode.of(1, 2), true);
    }

    @Test
    public void testCase1() {
        assertIs(SinglyListNode.of(3, 2, 2), SinglyListNode.of(3, 2, 2), true);
        assertIs(SinglyListNode.of(2, 1), SinglyListNode.of(1, 2), false);
    }

    private static void assertIs(
        final SinglyListNode head1,
        final SinglyListNode head2,
        final boolean result
    ) {
        assertThat(CompareTwoLinkedLists.compareLists(head1, head2))
            .isEqualTo(result);
    }
}
