package basicjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTimeConverter {
    @Test
    public void testTimeConverter(){
        final int a=13;
        final int b=5;
        final int c=58;
        assertEquals(basicjava.TimeConverter.TimeConverter(a,b,c),47158);
    }
}