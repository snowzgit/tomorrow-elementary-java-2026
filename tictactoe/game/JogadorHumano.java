package tictactoe.game;
import java.util.Scanner;

public class JogadorHumano extends Jogador {
    private Scanner sc = new Scanner(System.in);
    
    public JogadorHumano(String nome, char simbolo) {
        super(nome, simbolo);
        
    }
    
    @Override
    public Jogada escolherJogada(Tabuleiro tabuleiro) {
        System.out.print("Linha (0-2): ");
        int linha = sc.nextInt();
        
        System.out.print("Coluna: (0-2): ");
        int coluna = sc.nextInt();
        
        return new Jogada(linha, coluna);
    }
}