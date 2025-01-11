package consultaCEP;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class viaCEP_API {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe o CEP que deseja consultar: ");
        var busca_cep =  entrada.nextInt();

        try {
            while (busca_cep > 0) {
                //request
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("viacep.com.br/ws/" + busca_cep + "/json/"))
                        .build();
                //response
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


            }
        }catch (IllegalArgumentException e){
            System.out.println("SCRIPT ENCOUNTERED ERROR : ");
            System.out.println(e.getMessage());
        }

    }
}
