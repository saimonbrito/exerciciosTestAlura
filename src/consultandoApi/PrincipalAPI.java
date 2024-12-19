package consultandoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class PrincipalAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
       // System.out.println("Digite o nome do filme para busca: ");
       // var busca = leitura.nextLine();


       // String endereco = "https://www.omdbapi.com/?t=” + busca + “&apikey=115fc9a” ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://kitsu.io/api/edge/manga"))
                .build();

                 HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());



    }
}
