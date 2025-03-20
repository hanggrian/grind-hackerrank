package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class DesignerPdfViewerTest {
    @Test
    public void edgeCases() {
        List<Integer> h =
            Arrays.asList(
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1
            );
        assertThat(DesignerPdfViewer.designerPdfViewer(null, "Hello"))
            .isEqualTo(0);
        assertThat(DesignerPdfViewer.designerPdfViewer(h, null))
            .isEqualTo(0);
        assertThat(DesignerPdfViewer.designerPdfViewer(h, ""))
            .isEqualTo(0);
        assertThat(DesignerPdfViewer.designerPdfViewer(Collections.singletonList(1), "Hello"))
            .isEqualTo(0);
    }

    @Test
    public void example() {
        assertIs(
            Arrays.asList(
                1,
                3,
                1,
                3,
                1,
                4,
                1,
                3,
                2,
                5,
                5,
                5,
                5,
                1,
                1,
                5,
                5,
                1,
                5,
                2,
                5,
                5,
                5,
                5,
                5,
                5
            ),
            "torn",
            8
        );
    }

    @Test
    public void testCase0() {
        assertIs(
            Arrays.asList(
                1,
                3,
                1,
                3,
                1,
                4,
                1,
                3,
                2,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5
            ),
            "abc",
            9
        );
    }

    @Test
    public void testCase6() {
        assertIs(
            Arrays.asList(
                1,
                3,
                1,
                3,
                1,
                4,
                1,
                3,
                2,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                5,
                7
            ),
            "zaba",
            28
        );
    }

    private static void assertIs(final List<Integer> h, final String word, final int result) {
        assertThat(DesignerPdfViewer.designerPdfViewer(h, word))
            .isEqualTo(result);
    }
}
