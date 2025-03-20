package ds;

import concepts.SinglyListNode;

final class CycleDetection {
    private CycleDetection() {}

    static boolean hasCycle(final SinglyListNode head) {
        if (head == null || !head.hasNext()) {
            return false;
        }

        SinglyListNode slow = head.next;
        SinglyListNode fast = head.next.next;
        while (fast != null && fast.hasNext() && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}
