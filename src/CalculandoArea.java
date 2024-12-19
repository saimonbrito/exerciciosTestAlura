import java.util.Scanner;

public class CalculandoArea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

int opcao = 0;
       do{
           System.out.println("""
                      Escolha uma opção
                (1) Caucular Area de um Quadrado :
                (2) Caucular Area de um Círculo :
                (3) Sair :
                """);
           opcao = entrada.nextInt();

           switch (opcao){
               case 1:
                   System.out.println("Caucular area de um quadrado ");
                   System.out.println(" didite  um lado do quadrado ");
                   double lado = entrada.nextDouble();
                   double resultado = lado * lado;
                   System.out.println(String.format(" A area do quadrado e %.2f", resultado));
                   break;
               case  2 :
                   System.out.println("Caucular Area de um circulo");
                   System.out.println(" digite o raio do Circulo ");
                   double areacirculo = entrada.nextDouble();
                   double area = 3.14 * areacirculo * areacirculo;

                   System.out.println(String.format("A area do Circulo e %.2f ", area));
                   break;
               case 3:
                   System.out.println("saindo do systema ");
                   break;

               default:
                   System.out.println("opçao errada");
                   break;
           }

       }while (opcao != 3);
    }
}
