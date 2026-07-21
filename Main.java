package inicio;
public class Main {
	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador("Jogador 1", 'X');
		Jogador jogador2 = new Jogador("Jogador 2", 'O');
		
		Tabuleiro tabuleiro = new Tabuleiro();
		Partida partida = new Partida(tabuleiro,jogador1,jogador2);

		partida.partidaIniciar();
			
	}
}