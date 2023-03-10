package lista2_exercicios;

public class Imposto {
    public static void main(String[] args) {

    }
    static double OITO_PORCENTO = 0.08;
    static double DEZOITO_PORCENTO = 0.18;
    static double VINTE_OITO_PORCENTO = 0.28;
    
    private static double INSENCAO = 2000.00;
    public static double impostoDeRenda(double salario){
        if(salario < 2000.01){
            return 0;
        }
        else if(salario > 2000.00 && salario < 3000.01){
                return (salario - INSENCAO) * OITO_PORCENTO;
            }
        else if(salario < 4500.01){
            double valorDepoisDaInsencao = salario - INSENCAO;
            double calculoDeDezoito = valorDepoisDaInsencao - 1000;
            double calculoDeOito = valorDepoisDaInsencao - calculoDeDezoito;
            return calculoDeOito * OITO_PORCENTO + (calculoDeDezoito * DEZOITO_PORCENTO);
        }
        else if(salario > 4500.00){
            double valorDepoisDaInsencao = salario - INSENCAO;
            double calculoDeOito = valorDepoisDaInsencao - 1520.00;
            double calculoDeDezoito = valorDepoisDaInsencao - 1020.00; 
            double calculoDeVinte = valorDepoisDaInsencao - 2500.00;
            return (calculoDeOito * OITO_PORCENTO) + (calculoDeDezoito * DEZOITO_PORCENTO) + (calculoDeVinte * VINTE_OITO_PORCENTO);
        }

        return 0;
    } 

}
