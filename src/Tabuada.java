import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner esntarda = new Scanner(System.in);

        System.out.println("numero da tabuada de 1 a 10 ");

        var  numero = esntarda.nextInt();


                    System.out.println("tabuada " + numero + ":");
                    for (int i = 1; i <11 ; i++) {
                        System.out.println(numero + "x" + i + " = " + (numero * i));
                    }

    }
}
