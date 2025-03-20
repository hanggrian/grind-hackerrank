package algo;

final class DayOfTheProgrammer {
    private static final int JULIUS_CALENDAR_ADOPTION = 1918;

    private DayOfTheProgrammer() {}

    static String dayOfProgrammer(final int year) {
        if (year < 0) {
            return null;
        }
        if (year < JULIUS_CALENDAR_ADOPTION) {
            return String.format("%d.09.%d", year % 4 == 0 ? 12 : 13, year);
        }
        if (year == JULIUS_CALENDAR_ADOPTION) {
            return "26.09.1918";
        }
        return String.format(
            "%d.09.%d",
            year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
                ? 12
                : 13,
            year
        );
    }
}
