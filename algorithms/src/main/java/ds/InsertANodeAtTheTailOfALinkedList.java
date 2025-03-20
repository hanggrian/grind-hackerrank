package ds;

import concepts.SinglyListNode;

final class InsertANodeAtTheTailOfALinkedList {
    private InsertANodeAtTheTailOfALinkedList() {}

    static SinglyListNode insertNodeAtTail(final SinglyListNode head, final Integer data) {
        final SinglyListNode nodeToAdd = new SinglyListNode(data);
        if (head == null) {
            return nodeToAdd;
        }

        SinglyListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = nodeToAdd;
        return head;
    }
}
