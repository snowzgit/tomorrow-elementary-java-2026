package tictactoe.game;
import java.util.Random;

public class JogadorComputadorFacil extends Jogador {
    private Random random = new Random();
    
    public JogadorComputadorFacil(String nome, char simbolo) {
        super(nome, simbolo);
    }
    
    @Override
    public Jogada escolherJogada(Tabuleiro tabuleiro) {
        System.out.println("Computador pensando...");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int linha;
        int coluna;
        
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!tabuleiro.casaLivre(linha, coluna));

        return new Jogada(linha,coluna);
    }
}
