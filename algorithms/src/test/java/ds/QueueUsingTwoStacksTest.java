package ds;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class QueueUsingTwoStacksTest {
    @Test
    public void testCase0() {
        final QueueUsingTwoStacks stack = new QueueUsingTwoStacks();
        assertAction(stack, 1, 42);
        assertAction(stack, 2);
        assertAction(stack, 1, 14);
        assertAction(stack, 3, null, 14);
        assertAction(stack, 1, 28);
        assertAction(stack, 3, null, 14);
        assertAction(stack, 1, 60);
        assertAction(stack, 1, 78);
        assertAction(stack, 2);
        assertAction(stack, 2);
    }

    private static void assertAction(final QueueUsingTwoStacks stack, final int action) {
        assertAction(stack, action, null, null);
    }

    private static void assertAction(
        final QueueUsingTwoStacks stack,
        final int action,
        final Integer value
    ) {
        assertAction(stack, action, value, null);
    }

    private static void assertAction(
        final QueueUsingTwoStacks stack,
        final int action,
        final Integer value,
        final Integer result
    ) {
        switch (action) {
            case 1:
                stack.enqueue(value);
                assertThat(result).isNull();
                break;
            case 2:
                stack.dequeue();
                assertThat(value).isNull();
                assertThat(result).isNull();
                break;
            case 3:
                assertThat(value).isNull();
                assertThat(stack.peek())
                    .isEqualTo(result);
                break;
        }
    }
}
