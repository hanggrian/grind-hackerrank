package concepts;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public final List<String> prints = new LinkedList<>();

    public void println(String format, Object... args) {
        println(String.format(format, args));
    }

    public void println(Object o) {
        println(o.toString());
    }

    public void println(String s) {
        prints.add(s);
    }

    @Override
    public String toString() {
        return String.join("\n", prints);
    }
}
