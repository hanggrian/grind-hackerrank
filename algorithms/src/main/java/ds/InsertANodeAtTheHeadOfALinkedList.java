package ds;

import concepts.SinglyListNode;

final class InsertANodeAtTheHeadOfALinkedList {
    private InsertANodeAtTheHeadOfALinkedList() {}

    static SinglyListNode insertNodeAtHead(final SinglyListNode llist, final Integer data) {
        final SinglyListNode nodeToAdd = new SinglyListNode(data);
        nodeToAdd.next = llist;
        return nodeToAdd;
    }
}
