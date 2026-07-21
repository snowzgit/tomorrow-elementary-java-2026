package inicio;

public class Jogador {
	private String nome;
	private char simbolo;
		public Jogador(String nome,char simbolo) {
			this.nome = nome;
			this.simbolo = simbolo;
		}
		public char getSimbolo() {
			return simbolo;
		}
		public String getNome() {
			return nome;
		}
}
