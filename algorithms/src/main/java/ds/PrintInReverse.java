package ds;

import concepts.SinglyListNode;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

final class PrintInReverse {
    private PrintInReverse() {}

    static Collection<String> reversePrint(final SinglyListNode llist) {
        if (llist == null) {
            return Collections.emptyList();
        }

        final SinglyListNode current = llist;
        final List<String> reversed = new LinkedList<>();
        reversed.add(current.data.toString());
        while (current.next != null) {
            reversed.add(current.next.data.toString());
            current.next = current.next.next;
        }

        Collections.reverse(reversed);
        return reversed;
    }
}
