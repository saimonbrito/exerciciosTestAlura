package ProjetoListRefatore;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private double saldo;
    private double limite;
    private List<Produto> produto;

    public Compra(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.produto = new ArrayList<>();
    }

    public Boolean lancarProduto(Produto produto){

        if ( this.saldo > produto.getValor()){
            this.saldo -= produto.getValor();
            this.produto.add(produto);
            return  true;
        }

        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Produto> getProduto() {
        return produto;
    }
}
