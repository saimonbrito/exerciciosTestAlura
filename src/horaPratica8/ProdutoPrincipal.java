package horaPratica8;

import java.util.ArrayList;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto2 = new Produto("creme para cachorro",15);
        Produto produto1 = new Produto("champo para cachorro",8);
        Produto produto3 = new Produto("sabonete para cachorro",3);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double total = 0;
        for (Produto produto: produtos){
             total += produto.getPreco();

            System.out.println(produto);
            System.out.println(total);
        }

        total =total / produtos.size();
        System.out.println(String.format("preço medio dos produtos %.2f" ,total));
    }
}
