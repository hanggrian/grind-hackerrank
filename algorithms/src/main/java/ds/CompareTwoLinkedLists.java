package ds;

import concepts.SinglyListNode;

final class CompareTwoLinkedLists {
    private CompareTwoLinkedLists() {}

    static boolean compareLists(final SinglyListNode head1, final SinglyListNode head2) {
        SinglyListNode current1 = head1;
        SinglyListNode current2 = head2;
        while (current1 != null && current2 != null) {
            if (!current1.data.equals(current2.data)) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1 == null && current2 == null;
    }
}
