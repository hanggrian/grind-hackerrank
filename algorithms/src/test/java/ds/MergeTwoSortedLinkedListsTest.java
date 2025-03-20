package ds;

import concepts.SinglyListNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class MergeTwoSortedLinkedListsTest {
    @Test
    public void edgeCases() {
        assertThat(MergeTwoSortedLinkedLists.mergeLists(null, null))
            .isNull();
        assertThat(MergeTwoSortedLinkedLists.mergeLists(SinglyListNode.ZERO, null))
            .isEqualTo(SinglyListNode.ZERO);
        assertThat(MergeTwoSortedLinkedLists.mergeLists(null, SinglyListNode.ZERO))
            .isEqualTo(SinglyListNode.ZERO);
    }

    @Test
    public void example() {
        assertIs(
            SinglyListNode.of(1, 3, 7),
            SinglyListNode.of(1, 2),
            SinglyListNode.of(1, 1, 2, 3, 7)
        );
    }

    @Test
    public void testCase0() {
        assertIs(
            SinglyListNode.of(1, 2, 3),
            SinglyListNode.of(3, 4),
            SinglyListNode.of(1, 2, 3, 3, 4)
        );
    }

    @Test
    public void testCase1() {
        assertIs(
            SinglyListNode.of(4, 5, 6),
            SinglyListNode.of(1, 2, 10),
            SinglyListNode.of(1, 2, 4, 5, 6, 10)
        );
    }

    private static void assertIs(
        final SinglyListNode head1,
        final SinglyListNode head2,
        final SinglyListNode result
    ) {
        assertThat(MergeTwoSortedLinkedLists.mergeLists(head1, head2))
            .isEqualTo(result);
    }
}
