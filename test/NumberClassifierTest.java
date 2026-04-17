import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    void testBasic() {
        int[] nums = {1, -1, 0};
        String result = NumberClassifier.classify(nums);
        assertNotNull(result);
    }
}