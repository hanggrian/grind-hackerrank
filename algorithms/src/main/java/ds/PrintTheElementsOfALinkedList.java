package ds;

import concepts.SinglyListNode;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

final class PrintTheElementsOfALinkedList {
    private PrintTheElementsOfALinkedList() {}

    static Collection<String> printLinkedList(final SinglyListNode head) {
        return head == null
            ? Collections.emptyList()
            : head
            .stream()
            .map(node -> String.valueOf(node.data))
            .collect(Collectors.toList());
    }
}
