package concepts;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class SinglyListNodeTest {
    @Test
    public void nullValues() {
        assertThat(SinglyListNode.of()).isNull();
        assertThat(SinglyListNode.of((Integer[]) null)).isNull();
    }

    @Test
    public void sum() {
        assertThat(
            SinglyListNode.ZERO
                .stream()
                .mapToInt(n -> n.data)
                .sum()
        ).isEqualTo(0);
        assertThat(
            SinglyListNode
                .of(1, 3, 5, 7)
                .stream()
                .mapToInt(n -> n.data)
                .sum()
        ).isEqualTo(16);
    }

    @Test
    public void traverse() {
        ListNode<SinglyListNode> node = SinglyListNode.of(2, 4, 6, 8);
        assertThat(node.data).isEqualTo(2);

        node = node.next.next;
        assertThat(node.data).isEqualTo(6);

        node = node.next;
        assertThat(node.data).isEqualTo(8);
    }
}
