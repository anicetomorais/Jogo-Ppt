import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(); // Esse é o objeto Game, que serve para puxar as informações de Game.java

        // Aqui eu printei o texto inicial do jogo para o jogador saber o que deve ser feito.
        System.out.println("Bem vindo ao Pedra, Papel e Tesoura.");
        System.out.println("Esse é o primeiro projeto da minha vida como programador.");
        System.out.println("Vamos começar!");
        System.out.println("===========================================================");
        System.out.println("Digite: Pedra, Papel ou Tesoura.");
        // ------------------------------------------------------------------------------------

        String escolhaJogador = scanner.nextLine(); // Aqui serve para salvar a escolha do jogador em uma variável do tipo String.
        System.out.println("O Jogador Escolheu: " + escolhaJogador); // Aqui o jogador vai ver na tela qual foi a sua escolha.

        String escolhaComputador = game.escolhaComputador();    // Aqui vai chamar a classe Game.java para mostrar a escolha do Computador.
        System.out.println("O Computador escolheu: " + escolhaComputador); // Aqui vai exibit para o jogador a escolha do Computador.

        // Abaixo vai verificar quem venceu o jogo.
        String resultado = game.verificarVencedor(escolhaJogador, escolhaComputador);
        System.out.println(resultado);

        scanner.close();    // Serve para finalizar o Scanner para evitar bugs.

    }
}
