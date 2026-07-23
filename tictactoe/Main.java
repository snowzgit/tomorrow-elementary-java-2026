package tictactoe;

import tictactoe.game.*;

public class Main {
	public static void main(String[] args) {
		
		Jogador jogador1 = new JogadorHumano("Enio", 'X');
		Jogador jogador2 = new JogadorComputador("CPU 2", 'O');
		
		Tabuleiro tabuleiro = new Tabuleiro();
		Partida partida = new Partida(tabuleiro,jogador1,jogador2);

		partida.partidaIniciar();
			
	}
}
