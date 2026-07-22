package inicio;

public class Jogada {
	private int linha;
	private int coluna;
	
	public Jogada(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
	public boolean ehValida(){
		return linha >= 0 && linha <= 2 &&
	           coluna >= 0 && coluna <= 2;
		}
}
