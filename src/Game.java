import java.util.Random;

public class Game {
    public String escolhaComputador() {
        Random random = new Random();
        int escolhaComputador = random.nextInt(3);

        String escolhaComputadorString;
        // Dentro da Switch, 0 = Pedra, 1 = Papel, 2 = Tesoura. o Default é para nunca acontecer.
        switch (escolhaComputador) {
            case 0:
                escolhaComputadorString = "Pedra";
                break;
            case 1:
                escolhaComputadorString = "Papel";
                break;
            case 2:
                escolhaComputadorString = "Tesoura";
                break;
            default:
                escolhaComputadorString = "Opção inválida";
        }
        return escolhaComputadorString;

    }

    public String verificarVencedor(String jogador, String computador) {
        if (jogador.equals(computador)) {
            return "Empate!";

        } else if ((jogador.equals("Pedra") && computador.equals("Tesoura")) ||
        (jogador.equals("Papel") && computador.equals("Pedra")) ||
        (jogador.equals("Tesoura") && computador.equals("Papel"))) {
            return "Você venceu!";

        } else {
            return "O Computador venceu!";
            
        }
    }
}