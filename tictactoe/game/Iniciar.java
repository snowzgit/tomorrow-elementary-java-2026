package tictactoe.game;

import java.util.*;

public class Iniciar {
	public static void iniciar() {
		Scanner scanner = new Scanner(System.in);
	
	    System.out.print("Digite 1 para jogar entre dois jogadores ou digite 2 para jogar contra a máquina: ");
	    int opcao = scanner.nextInt();

    	Jogador jogador1;
    	Jogador jogador2;

    	if (opcao == 1) {
    		Random random = new Random();
    		
    		System.out.print("Digite o nome do primeiro jogador: ");
        	String nome1 = scanner.next();
        
        	System.out.print("Digite o nome do segundo jogador: ");
        	String nome2 = scanner.next();
        	
        	if (random.nextBoolean()) {
	        	jogador1 = new JogadorHumano(nome1, 'X');
	        	jogador2 = new JogadorHumano(nome2, 'O');
        	} else {
        		jogador1 = new JogadorHumano(nome2, 'X');
	        	jogador2 = new JogadorHumano(nome1, 'O');
        	}
        
        
    	} else {
    		System.out.print("Digite o seu nome: ");
    		String nome1 = scanner.next();
    		
    		System.out.print("Digite 1 para modo fácil\n2 para modo médio\3 para modo difícil: ");
    		int modo = scanner.nextInt();
    		

            switch(modo) {
                case 1:
                    jogador1 = new JogadorHumano(nome1, 'X');
	        	    jogador2 = new JogadorComputadorFacil("CPU", 'O');
                    break;

                case 2:
                    jogador1 = new JogadorComputadorMedio("CPU", 'X');
    			    jogador2 = new JogadorHumano(nome1, 'O');
                    break;

                default:
                    jogador1 = new JogadorComputadorDificil("CPU", 'X');
    			    jogador2 = new JogadorHumano(nome1, 'O');
            }
    	}

    	Tabuleiro tabuleiro = new Tabuleiro();
    	Partida partida = new Partida(tabuleiro, jogador1, jogador2);

    	partida.partidaIniciar();

    	scanner.close();
	}
}
