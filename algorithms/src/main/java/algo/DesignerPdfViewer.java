package algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class DesignerPdfViewer {
    private DesignerPdfViewer() {}

    static int designerPdfViewer(final List<Integer> h, final String word) {
        if (h == null || h.size() != 26 || word == null || word.isEmpty()) {
            return 0;
        }

        final Map<Character, Integer> counts = new HashMap<>();
        char key = (int) 'a';
        for (final int i : h) {
            counts.put(key++, i);
        }
        return word.chars().map(i -> counts.get((char) i)).max().getAsInt()
            * word.length();
    }
}
