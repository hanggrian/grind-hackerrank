package ds;

import java.util.Stack;

final class QueueUsingTwoStacks {
    private final Stack<Integer> pushStack = new Stack<>();
    private final Stack<Integer> popStack = new Stack<>();

    void enqueue(final int value) {
        pushStack.push(value);
    }

    int dequeue() {
        checkPopStack();
        return popStack.pop();
    }

    int peek() {
        checkPopStack();
        return popStack.peek();
    }

    boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    private void checkPopStack() {
        if (!popStack.isEmpty()) {
            return;
        }
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }
}
