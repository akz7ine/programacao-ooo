import java.util.ArrayList;
import java.util.Comparator;

/**
 * Gerencia a pontuação dos participantes.
 */
public class Ranking {
    private ArrayList<Participante> listaJogadores;

    /**
     * Cria uma nova lista de participantes.
     */
    public Ranking() {
        listaJogadores = new ArrayList<>();
    }

    /**
     * Insere um novo participante na lista de ranking.
     * @param jogador participante finalizado
     */
    public void registrarParticipante(Participante jogador) {
        listaJogadores.add(jogador);
    }

    /**
     * Exibe a classificação atual em ordem decrescente de pontos.
     */
    public void exibirRanking() {
        System.out.println("\n🏆 Classificação Geral:");
        listaJogadores.sort(Comparator.comparingInt(Participante::getScore).reversed());

        for (Participante p : listaJogadores) {
            System.out.println(p.getApelido() + " - Pontos: " + p.getScore());
        }
    }
}
