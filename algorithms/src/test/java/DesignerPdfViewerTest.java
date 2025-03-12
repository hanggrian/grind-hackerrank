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
    public void samples() {
        assertThat(
            DesignerPdfViewer.designerPdfViewer(
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
                "abc"
            )
        ).isEqualTo(9);

        assertThat(
            DesignerPdfViewer.designerPdfViewer(
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
                "zaba"
            )
        ).isEqualTo(28);
    }
}
