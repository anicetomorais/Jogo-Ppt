import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Bem-vindo ao Pedra, Papel e Tesoura!");
        System.out.println("Esse é o primeiro projeto da minha vida como programador.");
        System.out.println("===========================================================\n");

        while (true) {
            System.out.print("Digite: Pedra, Papel ou Tesoura: ");
            
            String escolhaJogador;
            while (true) {
                escolhaJogador = scanner.nextLine().trim();

                if (escolhaJogador.length() > 0) {
                    escolhaJogador = escolhaJogador.substring(0, 1).toUpperCase() + escolhaJogador.substring(1).toLowerCase();
                }

                if (escolhaJogador.equals("Pedra") || escolhaJogador.equals("Papel") || escolhaJogador.equals("Tesoura")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Digite apenas Pedra, Papel ou Tesoura.");
                }
            }

            System.out.println("Você escolheu: " + escolhaJogador);

            String escolhaComputador = game.escolhaComputador();
            System.out.println("O Computador escolheu: " + escolhaComputador);

            String resultado = game.verificarVencedor(escolhaJogador, escolhaComputador);
            System.out.println("\n========  RESULTADO  ========");
            System.out.println("Jogador: " + escolhaJogador);
            System.out.println("Computador: " + escolhaComputador);
            System.out.println(resultado);
            System.out.println("=============================\n");

            System.out.println("Deseja jogar novamente? (sim/não)");
            while (true) {
                String resposta = scanner.nextLine().trim().toLowerCase();
                if (resposta.equals("não")) {
                    System.out.println("Obrigado por jogar! Até a próxima!");
                    scanner.close();
                    return;
                } else if (resposta.equals("sim")) {
                    System.out.println("\nNovo jogo iniciado!\n");
                    break;
                } else {
                    System.out.println("Resposta inválida. Digite 'sim' ou 'não'.");
                }
            }
        }
    }
}
