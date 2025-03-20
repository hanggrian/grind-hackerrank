package ds;

import concepts.SinglyListNode;

final class MergeTwoSortedLinkedLists {
    private MergeTwoSortedLinkedLists() {}

    static SinglyListNode mergeLists(SinglyListNode head1, SinglyListNode head2) {
        SinglyListNode root = new SinglyListNode(null);
        SinglyListNode node = root;

        SinglyListNode current1 = head1;
        SinglyListNode current2 = head2;
        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                node.next = new SinglyListNode(current1.data);
                current1 = current1.next;
            } else {
                node.next = new SinglyListNode(current2.data);
                current2 = current2.next;
            }
            node = node.next;
        }

        if (current1 != null) {
            node.next = current1;
        } else if (current2 != null) {
            node.next = current2;
        }
        return root.next;
    }
}
