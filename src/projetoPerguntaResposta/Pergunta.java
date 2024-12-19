package projetoPerguntaResposta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pergunta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Quesatao> perguntas = new ArrayList<>();


        ///   /////////////



                perguntas.add(new Quesatao("Quantos paus faz uma canoa?", "Um"));
                perguntas.add(new Quesatao("Qual a capital do Brasil?", "Brasília"));

                // Exibindo uma pergunta
                Quesatao p = perguntas.get(0); // pegando a primeira pergunta
                System.out.println("Pergunta: " + p.getPergunta());
                  System.out.println("Escolha uma resposta ");
                  String respostaEscolhida = entrada.next();
                // Comparando a resposta
                 // digamos que essa resposta foi escolhida

                if (respostaEscolhida.equalsIgnoreCase(p.getResposta())) {
                    System.out.println("Resposta correta!");
                } else {
                    System.out.println("Resposta errada!");
                }


    }

}
