package projetoList;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o limite do cartao: ");
            double limiteCartao = entrada.nextDouble();
            CartaoCredido cartao = new CartaoCredido(limiteCartao);

        int sair = 1;
        while (sair != 0){

            System.out.println("Digite a descrição da compra: ");
            String descricao = entrada.next();

            System.out.println("Digite o valor da comprar: ");
            double valorCompra = entrada.nextDouble();

            Compra compra = new Compra(descricao,valorCompra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if ( compraRealizada){
                System.out.println("Compra realizada");
                System.out.println("Digite (0) para sair e (1) para continuar: ");
                sair = entrada.nextInt();

            }else {
                System.out.println("Saudo insuficiente!");
                sair = 0;
            }

        }

        System.out.println(" *********************************");
        System.out.println("Compra realizada: \n");

        Collections.sort(cartao.getCompra());
        for ( Compra c: cartao.getCompra()){

            System.out.println(c.getDescricao() + " - " + c.getValor());

        }
        System.out.println(" *********************************");
        System.out.println("\nSaldo do cartao: " + cartao.getSaldo());

    }
}
