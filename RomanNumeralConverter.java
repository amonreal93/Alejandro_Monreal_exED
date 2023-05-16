package ejercicios_junit;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralConverter {
	private static final Map<Character, Integer> ROMAN_TO_DECIMAL = new HashMap<Character, Integer>() {/**
		 * 
		 */
		private static final long serialVersionUID = 8284296349681969413L;

	{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static final TreeMap<Integer, String> DECIMAL_TO_ROMAN = new TreeMap<Integer, String>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static int romanToDecimal(String roman) {
        int decimal = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = ROMAN_TO_DECIMAL.get(roman.charAt(i));
            if (current < prev) {
                decimal -= current;
            } else {
                decimal += current;
            }
            prev = current;
        }
        return decimal;
    }

    public static String decimalToRoman(int decimal) {
        StringBuilder roman = new StringBuilder();
        for (int value : DECIMAL_TO_ROMAN.keySet()) {
            while (decimal >= value) {
                roman.append(DECIMAL_TO_ROMAN.get(value));
                decimal -= value;
            }
        }
        return roman.toString();
    }
}
