package algo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

final class GradingStudents {
    private GradingStudents() {}

    static Collection<Integer> gradingStudents(final List<Integer> grades) {
        return grades == null || grades.isEmpty()
            ? Collections.emptyList()
            : grades
            .stream()
            .map(grade -> {
                if (grade < 38) {
                    return grade;
                }
                final int remaining = 5 - (grade % 5);
                if (remaining < 3) {
                    return grade + remaining;
                }
                return grade;
            }).collect(Collectors.toList());
    }
}
