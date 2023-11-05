package ATIVIDADE_MODULO_12;

import java.util.ArrayList;
import java.util.Scanner;

public class EXERCICIO_MODULO_12 {
	public static void main(String[] args) {
        ArrayList<String> nomesMasculinos = new ArrayList();
        ArrayList<String> nomesFemininos = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome da pessoa (ou digite 'sair' para encerrar): ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                nomesMasculinos.add(nome);
            } else if (sexo == 'F') {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("Nomes masculinos: " + nomesMasculinos);
        System.out.println("Nomes femininos: " + nomesFemininos);
    }
}

