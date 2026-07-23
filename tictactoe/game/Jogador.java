package tictactoe.game;

public abstract class  Jogador {
	
	protected String nome;
	protected char simbolo;
	
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
    
    public abstract Jogada escolherJogada(Tabuleiro tabuleiro);
}
