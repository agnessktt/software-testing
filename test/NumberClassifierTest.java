import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    void testBasic() {
        int[] nums = {1, -1, 0};
        String result = NumberClassifier.classify(nums);
        assertNotNull(result);
    }

    @Test
    void testMorePositives() {
        assertEquals("More positives", NumberClassifier.classify(new int[]{1, 2, -1}));
    }

    @Test
    void testMoreNegatives() {
        assertEquals("More negatives", NumberClassifier.classify(new int[]{-1, -2, 1}));
    }

    @Test
    void testContainsZero() {
        assertEquals("Contains zero", NumberClassifier.classify(new int[]{0, 0, 0}));
    }

    @Test
    void testEqual() {
        assertEquals("Equal positives and negatives", NumberClassifier.classify(new int[]{1, -1}));
    }
}