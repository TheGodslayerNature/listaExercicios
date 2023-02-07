package lista5_exercicios;

public class CurrencyConverter {
    public static double dollarToReal(double dollarValue,double dollarQuantity){
        double iof = 0.06 * (dollarValue * dollarQuantity);
        return dollarValue * dollarQuantity + iof;
    }
}
