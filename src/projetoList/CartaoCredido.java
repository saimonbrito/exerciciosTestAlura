package projetoList;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredido {
    private double saldo;
    private double limite;
    private List<Compra> compra;

    public CartaoCredido(double limite) {
        this.limite = limite;
        this.saldo =limite;
        this.compra = new ArrayList<>();
    }

    public Boolean lancaCompra(Compra compra){

        if ( this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compra.add(compra);
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

    public List<Compra> getCompra() {
        return compra;
    }
}




