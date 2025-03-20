package ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

final class BalancedBrackets {
    private BalancedBrackets() {}

    static boolean isBalanced(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        final Stack<Character> symbols = new Stack<>();
        for (final char c : s.toCharArray()) {
            if (!BRACKETS.containsValue(c)) {
                symbols.push(c);
                continue;
            }

            if (!symbols.isEmpty() && BRACKETS.get(symbols.peek()) == c) {
                symbols.pop();
                continue;
            }
            return false;
        }
        return symbols.isEmpty();
    }

    private static final Map<Character, Character> BRACKETS = new HashMap<>();

    static {
        BRACKETS.put('(', ')');
        BRACKETS.put('[', ']');
        BRACKETS.put('{', '}');
    }
}
