package concepts;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public abstract class ListNode<T extends ListNode<T>> extends Node implements Iterable<T> {
    public T next;

    public ListNode(final Integer data) {
        super(data);
    }

    public final boolean hasNext() {
        return next != null;
    }

    public Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override
    public Iterator<T> iterator() {
        return new ListNodeIterator((T) this);
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof ListNode<?>)) {
            return false;
        }
        ListNode<T> node1 = this;
        ListNode<T> node2 = (ListNode<T>) other;
        while (node1 != null && node2 != null) {
            if (!Objects.equals(node1.data, node2.data)) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1 == null && node2 == null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    private class ListNodeIterator implements Iterator<T> {
        private T current;

        ListNodeIterator(final T node) {
            current = node;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            final T temp = current;
            current = current.next;
            return temp;
        }
    }
}
