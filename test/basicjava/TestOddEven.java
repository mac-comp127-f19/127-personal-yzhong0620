package basicjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestOddEven {
    @Test
    public void testOddEven(){
        final int num1=-87;
        assertEquals(basicjava.OddEven.isOdd(num1),true);

        final int num2=4;
        assertEquals(basicjava.OddEven.isOdd(num2),false);
    }
}