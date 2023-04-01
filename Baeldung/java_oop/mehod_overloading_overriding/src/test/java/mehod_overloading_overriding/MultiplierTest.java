package mehod_overloading_overriding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplierTest {

    @Test
    public void whenCalledMultiplyAndNoMatching_thenTypePromotion() {
        double result = Multiplier.multiply(10, 10);
        double expected = 100.0;
        double delta = 0.0001;
        assertEquals(expected, result, delta);
    }

    @Test
    public void whenCalledMultiplyAndMatching_thenNoTypePromotion() {
        assertEquals(Multiplier.multiply(10, 10, 10), 1000);
    }
}
