package ds;

import concepts.SinglyListNode;

final class GetNodeValue {
    private GetNodeValue() {}

    static int getNode(final SinglyListNode llist, final int positionFromTail) {
        if (llist == null) {
            return 0;
        }

        SinglyListNode current = llist;
        SinglyListNode previous = null;
        while (current != null) {
            final SinglyListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        current = previous;
        for (int i = 0; i < positionFromTail; i++) {
            current = current.next;
        }
        return current.data;
    }
}
