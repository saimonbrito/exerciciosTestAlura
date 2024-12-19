import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println(" digite um numero inteiro de 0 a 100");
        int entradaNumero = entrada.nextInt();


        if (entradaNumero > 0){
            System.out.println("numero positivo " + entradaNumero);
        }else {
            System.out.println("numero negativo " + entradaNumero);
        }

    }
}
