	package inicio;
	
	public class Tabuleiro {
		
		
		private char[][] casas;
		public Tabuleiro() {
			casas = new char[3][3];
			for(int linha = 0; linha < 3; linha++) {
				for(int coluna = 0; coluna < 3; coluna++)
					casas[linha][coluna] = ' ';	
			}
		}
		public void mostrarTabuleiro() {
			for (int linha = 0; linha < 3; linha++) {
	            for (int coluna = 0; coluna < 3; coluna++) {
	                System.out.print(casas[linha][coluna]);
	                
					if (coluna < 2) {
						System.out.print(" | ");
					}
				}
				System.out.println();
	
				if (linha < 2) {
					System.out.println("--+---+--");
				}
			}
		}
	
		public  boolean verificarVitoria() {
			for (int linha = 0; linha < 3; linha++) {
				if (casas[linha][0] != ' ' && 
					casas[linha][0] == casas[linha][1] && 
					casas[linha][0] == casas[linha][2]) {
					return true;
				}
			}
			for (int coluna = 0; coluna < 3; coluna++) {
				if (casas[0][coluna] != ' ' && 
					casas[0][coluna] == casas[1][coluna] &&
					casas[0][coluna] == casas[2][coluna]) {
					return true;
				}
			}
					if (casas[0][0]!=' ' &&
						casas[0][0] == casas[1][1] &&
						casas[0][0] == casas[2][2]) {
						return true;
				}
					if (casas[0][2]!=' ' &&
						casas[0][2] == casas[1][1] &&
						casas[0][2] == casas[2][0])
							return true;
	return false;
		}
		public void jogar(int linha, int coluna, char jogador) {
			casas[linha][coluna] = jogador;
		}
		public boolean casaLivre(int linha, int coluna) {
			return casas[linha][coluna] ==  ' ';
		}
		public boolean empate() {
		    for(int linha = 0; linha < 3; linha++) {
		        for(int coluna = 0; coluna < 3; coluna++) {
		        	
		        	if (casas[linha][coluna] == ' ') {
		        		return false;
		        	}
		        	}
		}
		return true;
		}
}