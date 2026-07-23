package inicio;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para jogar entre dois jogadores ou digite 2 para jogar contra a máquina: ");
        int opcao = scanner.nextInt();

        Jogador jogador1;
        Jogador jogador2;

        if (opcao == 1) {
        	System.out.print("Digite o nome do primeiro jogador: ");
            String nome1 = scanner.next();
            
            System.out.print("Digite o nome do segundo jogador: ");
            String nome2 = scanner.next();
            
            jogador1 = new JogadorHumano(nome1, 'X');
            jogador2 = new JogadorHumano(nome2, 'O');
            
            
        } else {
        	System.out.print("Digite o seu nome: ");
        	String nome1 = scanner.next();
        	
            jogador1 = new JogadorHumano(nome1, 'X');
            jogador2 = new JogadorComputador("CPU", 'O');
        }

        Tabuleiro tabuleiro = new Tabuleiro();
        Partida partida = new Partida(tabuleiro, jogador1, jogador2);

        partida.partidaIniciar();

        scanner.close();
    }
}
