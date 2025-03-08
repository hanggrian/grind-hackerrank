package concepts;

public class Solution {
    protected final StringBuilder builder = new StringBuilder();

    public final void print(final String format, final Object... args) {
        print(String.format(format, args));
    }

    public final void print(final Object o) {
        print(o.toString());
    }

    public final void print(final String s) {
        builder.append(s);
    }

    public final void println(final String format, final Object... args) {
        println(String.format(format, args));
    }

    public final void println(final Object o) {
        println(o.toString());
    }

    public final void println(final String s) {
        builder.append(s).append('\n');
    }

    public final void println() {
        builder.append('\n');
    }

    public String getResult() {
        return toString();
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
