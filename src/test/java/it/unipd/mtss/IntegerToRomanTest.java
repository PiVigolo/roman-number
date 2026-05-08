package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertOne() {
        int input = 1;
        String result = IntegerToRoman.convert(input);
        assertEquals("I", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberUnderRange() {
        IntegerToRoman.convert(0);
    }
}