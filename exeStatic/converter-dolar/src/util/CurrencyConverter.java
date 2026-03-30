package util;

public class CurrencyConverter {

    public static double converter(double dolar, double quantidade){
        double calc = dolar * quantidade;
        return calc + (calc * 0.06);
    }
}
