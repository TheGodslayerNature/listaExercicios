public class FuncoesAula {
    public static void main(String[] args){
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a,b,c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("A raiz quadrada de " + x +" é " + a);
        System.out.println("A raiz quadrada de " + y +" é " + b);
        System.out.println("A raiz quadrada de 25 é " + c);

        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(2.0,5.0);
        System.out.println(x + " elevado a " + y + " é igual a " + a);
        System.out.println(x + " elevado ao quadrado é igual a " + b);
        System.out.println("2 elevado aou quinto é igual a " + c);

        a = Math.abs(x);
        b = Math.abs(z);
        System.out.println("O valor absoluto de " + x + " é igual a " + a);
        System.out.println("O valor absoluto de " + z + " é igual a " + b);
    }
}
