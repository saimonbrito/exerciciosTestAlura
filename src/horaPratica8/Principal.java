package horaPratica8;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lacos = new ArrayList<>();
        Cachorro cachorro = new Cachorro();

        Animal animal = (Animal) cachorro;



        lacos.add("carros");
        lacos.add("cavalos");
        lacos.add("bicicletas");
        lacos.add("casas");

        lacos.forEach(s ->
            System.out.println(s)
        );
    }
}
