import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner entara = new Scanner(System.in);

         int escolha;
        String Nome = "saimon brito";
        String TipoConta ="corrente";
        double saldoAtual = 3000.00;

        System.out.println( "Dados inicial do cliente :");

        System.out.println("""
                Nome: saimon brito
                Tipo conta : corrente 
                Saldo inicial: R$ 3.000,00
                """);
        System.out.println("*********************");

        do {


            System.out.println("""
                    Operações
                       1- Consultar saldos
                       2- Receber valor
                       3- Transferir valor
                       4- Sair
                    """);

            System.out.println("Digite a operaçao desejada:");
            escolha = entara.nextInt();

            switch (escolha){
                case 1:
                    System.out.println(String.format("Seu saldo atual e : R$ %.2f " ,saldoAtual));


                    break;
                case 2:
                    System.out.println("valor para deposito : ");
                    double recebendoValor = entara.nextDouble();

                    saldoAtual += recebendoValor;

                    break;
                case 3:
                    System.out.println("valor para Tranferir : ");
                    double tranferirValor = entara.nextDouble();

                    if ( tranferirValor > saldoAtual){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldoAtual -= tranferirValor;
                    }

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Escolha Invalida ");
                    break;
            }





        }while (escolha != 4);



    }


}
