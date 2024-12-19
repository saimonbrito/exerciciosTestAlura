package desafio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa>listaDePessoas = new ArrayList<>();

        Pessoa pessoa4 = new Pessoa("saimon", 42);
        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Caroline", 35);
        Pessoa pessoa5 = new Pessoa("eliote", 21);


        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa4);
        listaDePessoas.add(pessoa5);


        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(3));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
