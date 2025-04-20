import java.util.Scanner;

/**
 * Início do programa. Controla o fluxo principal.
 */
public class Inicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ranking rankingGeral = new Ranking();

        while (true) {
            System.out.print("\nInforme o nome do participante: ");
            String apelido = entrada.nextLine();
            Participante novoJogador = new Participante(apelido);
            Rodada novaRodada = new Rodada(novoJogador);

            System.out.println("Adivinhe o número sorteado entre 1 e 100:");

            boolean finalizado = false;
            while (!finalizado) {
                System.out.print("Chute: ");
                int numeroTentado = entrada.nextInt();
                String resposta = novaRodada.tentar(numeroTentado);

                switch (resposta) {
                    case "maior" -> System.out.println("O número é maior.");
                    case "menor" -> System.out.println("O número é menor.");
                    case "acertou" -> {
                        System.out.println("✅ Você acertou!");
                        System.out.println("Tentativas: " + novoJogador.getTotalTentativas());
                        System.out.println("Pontuação: " + novoJogador.getScore());
                        finalizado = true;
                    }
                }
            }

            entrada.nextLine(); // limpa buffer
            rankingGeral.registrarParticipante(novoJogador);
            rankingGeral.exibirRanking();

            System.out.print("Deseja continuar com outro jogador? (s/n): ");
            String continuar = entrada.nextLine();
            if (!continuar.equalsIgnoreCase("s")) break;
        }

        entrada.close();
    }
}
