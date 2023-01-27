package lista2_exercicios;

public class Imposto {
    public static void main(String[] args) {

    }
    static double OITO_PORCENTO = 0.08;
    static double DEZOITO_PORCENTO = 0.18;
    static double VINTE_OITO_PORCENTO = 0.28;
    public static double impostoDeRenda(double salario){
        double calculoIncide = salario - 2000.00;
        double imposto = 0.0;
        if (salario > 2000.00 && salario <= 3000.00){
            imposto = calculoIncide * OITO_PORCENTO;
        }
        else if (salario > 3000.00 && salario < 4500.00) {
            double valorPos = calculoIncide - (salario - 3000.00);
            double taxa8Porcento = valorPos * OITO_PORCENTO;
            double taxa18Porcento = (salario - 3000.00) * DEZOITO_PORCENTO;

            imposto = taxa8Porcento + taxa18Porcento;
        }
        else if (salario > 4500.00) {
            double firstValuePosInci = calculoIncide - (salario - 3000.00);
            double valor28kAnd18 = salario - 4000.00;
            double get28P = valor28kAnd18 - 500;
//            double

            double taxa8Porcento = calculoIncide * OITO_PORCENTO;

            double taxa18Porcento = firstValuePosInci * DEZOITO_PORCENTO;

            double taxa28Porcento = get28P * VINTE_OITO_PORCENTO;
            System.out.println(taxa8Porcento + taxa18Porcento + taxa28Porcento);

        }
        return imposto;
    }

}
