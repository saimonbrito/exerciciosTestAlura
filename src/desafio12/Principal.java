package desafio12;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaInteiro = new ArrayList<>();

        listaInteiro.add(25);
        listaInteiro.add(2);
        listaInteiro.add(5);
        listaInteiro.add(15);
        listaInteiro.add(89);
        listaInteiro.add(250);
        listaInteiro.add(2525);

        Collections.sort(listaInteiro);
        System.out.println(listaInteiro);

        /// //////////////////////////////////////// exercicio2/////////

        ArrayList<String> titulos = new ArrayList<>();

        Titulo titulo = new Titulo("saimon");
        Titulo titulo2 = new Titulo("gostosinha");
        Titulo titulo3 = new Titulo("bebe");
        Titulo titulo4 = new Titulo("taice");
        Titulo titulo8 = new Titulo("eliot");

        titulos.add(titulo2.getNome());
        titulos.add(titulo.getNome());
        titulos.add(titulo3.getNome());
        titulos.add(titulo4.getNome());
        titulos.add(titulo8.getNome());

        Collections.sort(titulos);

        System.out.println(titulos);

        /// ///////////////////////////exercicio4////////////////

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);



        /// /////////////////////////exeercicio5/////////////////////

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);




    }
}
