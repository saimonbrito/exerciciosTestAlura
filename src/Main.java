//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double nota1 = 65;
        double nota2 = 58;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);

         System.out.println("");

        double cast1 = 13.5;
        int cast2 = (int) cast1;

        System.out.println("casting de double para int " + cast2);


        System.out.println("");

        char l = 'd';
        String testo = "mastigar";

        System.out.println(testo + " " + l + " vagar");

        System.out.println("");

        double precoProduto = 45;
        int quantidade = 2;

    System.out.println("valor total " + (precoProduto * quantidade));

        System.out.println("");

        double valorEmDolares = 1895;
        double valorReal = 4.94;

        double conversao = valorEmDolares * valorReal;

        System.out.println(String.format("valor %.0f convertido em real e %.2f  " ,valorEmDolares,  conversao));

        System.out.println("");

        double precoOriginal =  143.20;


        double porcentagem = 10.0;
        double desconto = (precoOriginal / 100.0) * porcentagem ;
        int valorComDesconto = (int) (precoOriginal - desconto);
        double valorComdeconto2 = precoOriginal - desconto;

        System.out.println(String.format("""
                valor original %.2f 
                desconto %.2f
                valor com descont %.2f
                valor com desconto com casting %d
                """  , precoOriginal , desconto,valorComdeconto2, valorComDesconto));
      





    }
}