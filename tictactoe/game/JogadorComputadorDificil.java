package tictactoe.game;
import java.util.Random;

public class JogadorComputadorDificil extends Jogador {
    private Random random = new Random();
    
    public JogadorComputadorDificil(String nome, char simbolo) {
        super(nome, simbolo);
    }

    private Jogada procurarJogadaVencedora(Tabuleiro tabuleiro, char simbolo) {
        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                if(tabuleiro.casaLivre(linha, coluna)) {
                    tabuleiro.jogar(linha, coluna, simbolo);

                    boolean venceu = tabuleiro.verificarVitoria();
                    tabuleiro.limparCasa(linha, coluna);

                    if(venceu) {
                        return new Jogada(linha, coluna);
                    }
                }
            }
        }

        return null;
    }
    
    @Override
    public Jogada escolherJogada(Tabuleiro tabuleiro) {
        System.out.println("Computador pensando...");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //primeiro busca a jogada que garante a vitória
        Jogada jogada = procurarJogadaVencedora(tabuleiro, simbolo);
        if(jogada != null) return jogada;

        char adversario = simbolo == 'X' ? 'O' : 'X';
        
        //se ela não existe, impede que o adversário ganhe na próxima jogada
        jogada = procurarJogadaVencedora(tabuleiro, adversario);
        if(jogada != null) return jogada;

        //se adversário não ganha na próxima, tenta jogar no centro
        if(tabuleiro.casaLivre(1, 1)) {
            return new Jogada(1, 1);
        }

        for(int i=0; i<3; i+=2) {
            for(int j=0; j<3; j+=2) {
                if(tabuleiro.casaLivre(i, j)) return new Jogada(i, j);
            }
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
