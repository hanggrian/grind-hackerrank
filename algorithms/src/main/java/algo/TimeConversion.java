package algo;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;

final class TimeConversion {
    private TimeConversion() {}

    static String timeConversion(final String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        final String timeFormat = s.substring(s.length() - 2);
        if (!timeFormat.chars().allMatch(value -> isLetter(value) && isUpperCase(value))) {
            return null;
        }

        int hours = Integer.parseInt(s.substring(0, 2));
        if (timeFormat.equals("PM")) {
            if (hours < 12) {
                hours += 12;
            }
        } else {
            if (hours >= 12) {
                hours -= 12;
            }
        }
        return String.format("%02d%s", hours, s.substring(2, s.length() - 2));
    }
}
