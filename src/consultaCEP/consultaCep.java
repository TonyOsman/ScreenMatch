package consultaCEP;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultaCep {


        public Endereco buscaEndereco(String cep) {

            URI endereco =URI.create("https://viacep.com.br/ws/" + cep + "/json/");
            //request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
            try {
                //response
                HttpResponse<String> response = HttpClient
                        .newHttpClient()
                        .send(request, HttpResponse.BodyHandlers.ofString());

                return new Gson().fromJson(response.body(), Endereco.class);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }catch (Exception e) {
                System.out.println("UNIDENTIFIED ERROR: " + e.getMessage());
            }
            return null;
        }
}

