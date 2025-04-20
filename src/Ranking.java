import java.util.ArrayList;
import java.util.Comparator;

/**
 * Gerencia a pontuação dos participantes.
 */
public class Ranking {
    private ArrayList<Participante> listaJogadores;

   
    public Ranking() {
        listaJogadores = new ArrayList<>();
    }

    public void registrarParticipante(Participante jogador) {
        listaJogadores.add(jogador);
    }


    public void exibirRanking() {
        System.out.println("\n🏆 Classificação Geral:");
        listaJogadores.sort(Comparator.comparingInt(Participante::getScore).reversed());

        for (Participante p : listaJogadores) {
            System.out.println(p.getApelido() + " - Pontos: " + p.getScore());
        }
    }
}
