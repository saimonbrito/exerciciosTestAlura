package ProjetoListRefatore;

import java.util.Collections;
import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o limite do cartao: ");
        double limiteCartao = entrada.nextDouble();
        Compra comprar = new Compra(limiteCartao);

        int sair = 1;
        while (sair != 0){

            System.out.println("Digite a descrição da compra: ");
            String descricao = entrada.next();

            System.out.println("Digite o valor da comprar: ");
            double valorCompra = entrada.nextDouble();

            Produto produto = new Produto(descricao,valorCompra);
            boolean compraRealizada = comprar.lancarProduto(produto);

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

        Collections.sort(comprar.getProduto());
        for ( Produto c: comprar.getProduto()){

            System.out.println(c.getDescricao() + " - " + c.getValor());

        }
        System.out.println(" *********************************");
        System.out.println("\nSaldo do cartao: " + comprar.getSaldo());

    }
}
