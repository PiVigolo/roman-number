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
    public void testConvertZeroThrowsException() {
        // Act
        IntegerToRoman.convert(0);
    }

    @Test
    public void testConvertFourteen() {
        int input = 14;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIV", result);
    }
    @Test
    public void testConvertFourHundredNinetyFour() {
        int input = 494;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXCIV", result);
    }
    @Test
    public void testConvertNineHundredNinetyNine() {
        int input = 999;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCIX", result);
    }
    @Test
    public void testConvertThousand() {
        int input = 1000;
        String result = IntegerToRoman.convert(input);
        assertEquals("M", result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertMoreThousandThrowsException() {
        // Act
        IntegerToRoman.convert(1100);
    }
}