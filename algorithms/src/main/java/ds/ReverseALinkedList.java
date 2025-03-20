package ds;

import concepts.SinglyListNode;

final class ReverseALinkedList {
    private ReverseALinkedList() {}

    static SinglyListNode reverse(final SinglyListNode llist) {
        SinglyListNode current = llist;
        SinglyListNode previous = null;
        while (current != null) {
            final SinglyListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
