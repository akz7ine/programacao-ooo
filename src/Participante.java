
public class Participante {
    private String apelido;
    private int totalTentativas;
    private int score;

   
    public Participante(String apelido) {
        this.apelido = apelido;
        this.totalTentativas = 0;
        this.score = 0;
    }

    public String getApelido() {
        return apelido;
    }

    public int getTotalTentativas() {
        return totalTentativas;
    }

    public int getScore() {
        return score;
    }

    public void registrarTentativa() {
        totalTentativas++;
    }

    public void somarPontos(int pontos) {
        score += pontos;
    }
}
