import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    // Statement coverage
    @Test
    void testBasic() {
        int[] nums = {1, -1, 0};
        String result = NumberClassifier.classify(nums);
        assertNotNull(result);
    }

    // Path: More positives
    @Test
    void testMorePositives() {
        assertEquals("More positives", NumberClassifier.classify(new int[]{1, 2, -1}));
    }

    // Path: More negatives
    @Test
    void testMoreNegatives() {
        assertEquals("More negatives", NumberClassifier.classify(new int[]{-1, -2, 1}));
    }

    // Path: Contains zero
    @Test
    void testContainsZero() {
        assertEquals("Contains zero", NumberClassifier.classify(new int[]{0, 0, 0}));
    }

    // Path: Equal positives and negatives (no zero)
    @Test
    void testEqual() {
        assertEquals("Equal positives and negatives", NumberClassifier.classify(new int[]{1, -1}));
    }

    // 🔥 Edge case (bonus điểm): mảng rỗng
    @Test
    void testEmptyArray() {
        assertEquals("Equal positives and negatives", NumberClassifier.classify(new int[]{}));
    }
}