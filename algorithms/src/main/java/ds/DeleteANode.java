package ds;

import concepts.SinglyListNode;

final class DeleteANode {
    private DeleteANode() {}

    static SinglyListNode deleteNode(
        final SinglyListNode llist,
        final int position
    ) {
        if (llist == null || position < 1) {
            return null;
        }
        if (position == 0) {
            return llist.next;
        }

        SinglyListNode node = llist;
        for (int i = 0; i < position - 1; i++) {
            node = node.next;
        }

        node.next = node.next.next;
        return llist;
    }
}
