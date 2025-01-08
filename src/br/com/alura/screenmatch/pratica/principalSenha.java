package br.com.alura.screenmatch.pratica;

import java.util.Scanner;

public class principalSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Senha s1 = new Senha();
        System.out.println("Define seu senha (minimum 8 caracteres) : ");
        s1.setSenha(entrada.nextLine());
        System.out.println("Confirma sua senha: ");
        s1.setConfirmacaoSenha(entrada.nextLine());

        if (s1.getSenha().equals(s1.getConfirmacaoSenha())) {

            System.out.println("Senha correta!");
        }else{
            System.out.println("Senha não confere!");
        }



    }
}
