package concepts;

public final class SinglyListNode extends ListNode<SinglyListNode> {
    public static final SinglyListNode ZERO = new SinglyListNode(0);

    public SinglyListNode() {
        super(0);
    }

    public SinglyListNode(final Integer data) {
        super(data);
    }

    public SinglyListNode(final Integer data, final SinglyListNode next) {
        super(data);
        this.next = next;
    }

    public static SinglyListNode of(final Integer... data) {
        if (data == null || data.length == 0) {
            return null;
        }
        SinglyListNode head = new SinglyListNode(data[0]);
        SinglyListNode next = head;
        for (int i = 1; i < data.length; i++) {
            next.next = new SinglyListNode(data[i]);
            next = next.next;
        }
        return head;
    }
}
