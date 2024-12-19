package desafio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> lojaGamer = new ArrayList<>();

        Produto produto = new Produto("notbook",3600,5);
        Produto produto1 = new Produto("teclado game ",160,8);
        Produto produto2 = new Produto("mouse option",98,7);
        Produto produto3 = new Produto("desktop gamer",7500,2);

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("abacate",3.99, 5,"2025-12-25");
        ProdutoPerecivel produtoPerecivel3 = new ProdutoPerecivel("mamao",1.99, 8,"2025-12-25");




        lojaGamer.add(produto);
        lojaGamer.add(produto1);
        lojaGamer.add(produto2);
        lojaGamer.add(produto3);

        System.out.println("tamanho da lista de produtos " + lojaGamer.size());
        System.out.println(" ");
        System.out.println("consultar produto " + lojaGamer.get(0));
        System.out.println(" ");

        System.out.println("promoçao: " + produtoPerecivel1);
        System.out.println(" ");
        System.out.println("super oferta: " + produtoPerecivel3);

        for (Produto produtos : lojaGamer) {
            System.out.println(produtos);
        }





    }
}
