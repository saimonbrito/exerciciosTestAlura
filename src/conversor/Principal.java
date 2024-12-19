package conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ConversorMoeda conversorMoeda = new ConversorMoeda();





        var loop= 1 ;
        while (loop != 0){

            System.out.println("Conversor de Moedas");

            System.out.println("  ");
            System.out.println("""
                escolha a opção:
                (1) converter Dolar para Real:
                (2) converter Real em Dolar:
                (3) sair :
                """);

            var escolha = entrada.nextInt();
            switch(escolha){
                case 1 :
                    System.out.println(" Digite o valor en Dolar: ");
                    var dolar = entrada.nextDouble();
                    conversorMoeda.converterDolarParaReal(dolar);
                    break;
                case 2 :
                    System.out.println(" Digite o valor en Real: ");
                    var real = entrada.nextDouble();
                    conversorMoeda.converterRealParaDolar(real);

                    break;
                case 3:
                    System.out.println("sair do Systema");
                    loop = 0;
                    break;

                default:
                    System.out.println("Escolha incorreta ");
            }

        }



    }



}
