package ejercicios_junit;

public class CurrencyConverter {

    private static final double EUR_TO_USD_RATE = 1.20;

    public double dollar2euro(double dollarAmount) {
        return dollarAmount / EUR_TO_USD_RATE;
    }

    public double euro2dollar(double euroAmount) {
        return euroAmount * EUR_TO_USD_RATE;
    }
}
