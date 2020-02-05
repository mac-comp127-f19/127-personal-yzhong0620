package basicjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestHypotenuse {
    @Test
    public void testHypotenuse() {
        final double lgt1 = 3;
        final double lgt2 = 4;
        final double lgt3 = 5;
        final double lgt4 = 12;
        assertEquals(5,basicjava.Hypotenuse.calculateHypotenuse(lgt1,lgt2));
        assertEquals(13,basicjava.Hypotenuse.calculateHypotenuse(lgt3,lgt4));
    }
}