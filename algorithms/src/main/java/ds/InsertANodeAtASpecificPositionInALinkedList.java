package ds;

import concepts.SinglyListNode;

final class InsertANodeAtASpecificPositionInALinkedList {
    private InsertANodeAtASpecificPositionInALinkedList() {}

    static SinglyListNode insertNodeAtPosition(
        final SinglyListNode llist,
        final Integer data,
        final int position
    ) {
        if (llist == null || position < 1) {
            return null;
        }

        SinglyListNode node = llist;
        for (int i = 0; i < position - 1; i++) {
            node = node.next;
        }

        final SinglyListNode temp = node.next;
        node.next = new SinglyListNode(data);
        node.next.next = temp;
        return llist;
    }
}
