package consultaCEP;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        consultaCep consultaCep = new consultaCep();

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = entrada.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
