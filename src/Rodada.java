import java.util.Random;

/**
 * Responsável por controlar uma rodada do jogo.
 */
public class Rodada {
    private Participante jogadorAtual;
    private int valorSecreto;

  
    public Rodada(Participante jogador) {
        this.jogadorAtual = jogador;
        this.valorSecreto = new Random().nextInt(100) + 1;
    }

    public String tentar(int tentativa) {
        jogadorAtual.registrarTentativa();

        if (tentativa == valorSecreto) {
            int calculoPontuacao = 100 - jogadorAtual.getTotalTentativas() * 10;
            jogadorAtual.somarPontos(Math.max(calculoPontuacao, 0));
            return "acertou";
        } else if (tentativa < valorSecreto) {
            return "maior";
        } else {
            return "menor";
        }
    }
}
