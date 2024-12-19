import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        System.out.println(" comparamdo mureos inteiro de 0 a 100 ");

        System.out.println(" Digite o primeiro numero ");
        int primeiroNumero = entrada.nextInt();

        System.out.println(" Digite o segundo numero");
        int segundoNumero = entrada.nextInt();

        if ( primeiroNumero == segundoNumero){
            System.out.println(" numeros sao iguais");
        }else {

            if (primeiroNumero > segundoNumero){
                System.out.println(" Primeiro numero e maior ");
            }else {
                System.out.println(" Segundo numero e maior ");
            }

        }

    }
}
