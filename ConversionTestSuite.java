package ejercicios_junit;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class ConversionTestSuite {

    @Test
    public void testDollar2Euro() {
        CurrencyConverter cc = new CurrencyConverter();
        assertEquals(8.75, cc.dollar2euro(10.5), 0.01);
        assertEquals(16.67, cc.dollar2euro(20), 0.01);
    }

    @Test
    public void testEuro2Dollar() {
        CurrencyConverter cc = new CurrencyConverter();
        assertEquals(11.11, cc.euro2dollar(10), 0.01);
        assertEquals(24.96, cc.euro2dollar(20.30), 0.01);
    }


    @Test
    public void testRomanToDecimal() {
        assertEquals(21, RomanNumeralConverter.romanToDecimal("XXI"));
        assertEquals(2016, RomanNumeralConverter.romanToDecimal("MMXVI"));
    }

    @Test
    public void testDecimalToRoman() {
        assertEquals("XXI", RomanNumeralConverter.decimalToRoman(21));
        assertEquals("MMXVI", RomanNumeralConverter.decimalToRoman(2016));
    }
}
