package util;

public class DolarCalculator {

    public static double calc (double dolar, double quant){
        double valor =  dolar * quant;
        return valor + (valor * 0.06);
    }




}
