package desafio12;

public class Titulo  implements  Comparable <Titulo>{
    private  String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo tituloOutro) {
        return this.nome.compareTo(tituloOutro.nome);
    }
}
