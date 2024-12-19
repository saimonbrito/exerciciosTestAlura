package horaPratica8;

import java.util.ArrayList;

public class Produto {
    private String nomePoduto;
    private double Preco;

    public Produto(String nomePoduto, int preco) {
        this.nomePoduto = nomePoduto;
        Preco = preco;
    }

    public String getNomePoduto() {
        return nomePoduto;
    }

    public void setNomePoduto(String nomePoduto) {
        this.nomePoduto = nomePoduto;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomePoduto='" + nomePoduto + '\'' +
                ", Preco=" + Preco +
                '}';
    }
}
