package conta;

import conta.conta_util.Cores;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        while (true) {
            System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE
                    + "************************************************");
            System.out.println("BANCO");
            System.out.println("************************************************");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Listar todas as contas");
            System.out.println("3 - Buscar contas por número");
            System.out.println("4 - Atualizar dados da conta");
            System.out.println("5 - Excluir conta");
            System.out.println("6 - Sacar");
            System.out.println("7 - Depositar");
            System.out.println("8 - Transferir valores entre contas");
            System.out.println("9 - Sair");
            System.out.println("************************************************");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao == 9) {
                System.out.println("Obrigado por usar o nosso sistema.");
                sobre();
                scanner.close();
                System.exit(0);
            }
            switch (opcao) {
                case 1 -> {
                    System.out.println(Cores.TEXT_WHITE + "Criar conta");
                    break;
                }
                case 2 -> {
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as contas");
                    break;
                }
                case 3 -> {
                    System.out.println(Cores.TEXT_WHITE + "Buscar contas por número");
                    break;
                }
                case 4 -> {
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da conta");
                    break;
                }
                case 5 -> {
                    System.out.println(Cores.TEXT_WHITE + "Excluir conta");
                    break;
                }
                case 6 -> {
                    System.out.println(Cores.TEXT_WHITE + "Sacar");
                    break;
                }
                case 7 -> {
                    System.out.println(Cores.TEXT_WHITE + "Depositar");
                    break;
                }
                case 8 -> {
                    System.out.println(Cores.TEXT_WHITE + "Transferir valores entre contas");
                    break;
                }
                default -> {
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida\n" + Cores.TEXT_RESET);
                    break;
                }

            }
        }
    }

    public static void sobre() {
        System.out.println("************************************************");
        System.out.println("Desenvolvido por: Luiz Henrique Machado");
        System.out.println("Generation Brasil - generation@generation.org");
        System.err.println("github.com/conteudoGeneration");
        System.out.println("************************************************");
    }
}
