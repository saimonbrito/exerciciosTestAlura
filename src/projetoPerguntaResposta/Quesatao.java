package projetoPerguntaResposta;

import java.util.ArrayList;
import java.util.List;

public class Quesatao {

    private  String pergunta;
    private  String resposta;
    private List<String> questao;

    public Quesatao(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public List<String> getQuestao() {
        return questao;
    }

    @Override
    public String toString() {
        return "Quesatao{" +
                "pergunta='" + pergunta + '\'' +
                ", resposta='" + resposta + '\'' +
                '}';
    }
}
