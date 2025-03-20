package ds;

import concepts.SinglyListNode;

final class DeleteDuplicateValueNodesFromASortedLinkedList {
    private DeleteDuplicateValueNodesFromASortedLinkedList() {}

    static SinglyListNode removeDuplicates(final SinglyListNode llist) {
        SinglyListNode previous;
        SinglyListNode current = llist;
        while (current != null) {
            previous = current;
            current = current.next;
            while (current != null && current.data.equals(previous.data)) {
                previous.next = current.next;
                current = current.next;
            }
        }
        return llist;
    }
}
