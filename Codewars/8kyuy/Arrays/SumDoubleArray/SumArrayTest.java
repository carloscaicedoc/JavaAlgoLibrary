import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumArrayTest {

    @Test 
    public void testSum() {
        assertEquals(6, SumArray.sum(new double[] {1, 2, 3}), 1e-4);
        assertEquals(9.2, SumArray.sum(new double[] {1, 5.4, 4, 0, -1}), 1e-4);
        assertEquals(320, SumArray.sum(new double[] {30, 89, 100, 101}), 1e-4);
    }
}
