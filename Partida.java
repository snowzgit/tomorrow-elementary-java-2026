package inicio;
import java.util.Scanner;

public class Partida {
	private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
	private Jogador jogadorAtual;
	
	Scanner sc = new Scanner(System.in);

	public Partida(Tabuleiro tabuleiro, Jogador jogador1, Jogador jogador2) {
		this.tabuleiro = tabuleiro;
		this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        
		this.jogadorAtual = jogador1;
	}
	public void partidaIniciar() {
		while(true) {
			System.out.println();
			
			tabuleiro.mostrarTabuleiro();
		
			System.out.println();
		
			Jogador atual = getJogadorAtual();
			
			System.out.println("===== VEZ DO JOGADOR " + atual.getNome() +" '" + atual.getSimbolo() + "'" + " =====");	
			
			Jogada jogada = jogadorAtual.escolherJogada(tabuleiro);
			
			if(!jogada.ehValida()) {
				System.out.print("Posições Inválidas");
				continue;
				}
				
			int linha = jogada.getLinha();
			int coluna = jogada.getColuna();
			if(fazerJogada(linha, coluna)) {
				if(terminou()) {
					tabuleiro.mostrarTabuleiro();
					System.out.println("Jogador "+ atual.getNome() +", " + atual.getSimbolo() + " Venceu!");
				break;
			}
				
			if(tabuleiro.empate()) {
				tabuleiro.mostrarTabuleiro();
				System.out.println("Empate!");
				break;
			}
			trocarJogador();
			} else {
			    System.out.println("Casa ocupada!");
					}
				}
	}
	
	public boolean fazerJogada(int linha, int coluna) {
		if(tabuleiro.casaLivre(linha, coluna)) {
			
			tabuleiro.jogar(linha, coluna, jogadorAtual.getSimbolo());
			return true;
		}
		return false;
	}
	
	public Jogador getJogadorAtual() {
		return jogadorAtual;
	}
	public void trocarJogador() {
		 if(jogadorAtual == jogador1) {
	            jogadorAtual = jogador2;
	        } else {
	            jogadorAtual = jogador1;
	        }
	}

	public boolean terminou() {
		return tabuleiro.verificarVitoria();
	}
}