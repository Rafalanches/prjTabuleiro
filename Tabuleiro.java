	package pctTabuleiro;
	
	import java.util.Scanner;
	
	public class Tabuleiro {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] tabuleiro = new int[16];
			int jogador1 = 0;
			int jogador2 = 0;
			int jogada;
	
			System.out.println("Bem vindo ao jogo de Tabuleiro sobre Minecraft\n");
			System.out.println("Regras do Jogo:\n" + "O jogo é para dois jogadores;\n" + "O jogo possui 15 casas;\n"
					+ "Quem chegar na última casa ganha;\n" + " ");
	
			for (int i = 0; i < tabuleiro.length; i++) {
				tabuleiro[i] = i + 1;
			}
	
			while (jogador1 < 15 && jogador2 < 15) {
				System.out.println("\nJogador 1, é a sua vez. Pressione enter para jogar o dado.");
				input.nextLine();
				jogada = (int) (Math.random() * 6) + 1;
				jogador1 += jogada;
				System.out.println("Você jogou o dado e avançou " + jogada + " casas.");
				if (jogador1 > 14) {
					System.out.println("Parabéns, você zerou o Minecraft!");
					break;
				}
	
				System.out.println("Você está na casa " + tabuleiro[jogador1 - 1] + ".");
	
				switch (jogador1) {
				case 1:
					System.out.println("Está de noite, você se escondeu em uma caverna e dormiu.");
					break;
				case 2:
					System.out.println("Você encontrou uma recompensa em uma vila.");
					break;
				case 3:
					System.out.println("FIQUE ONDE ESTÁ! Há monstros por perto, é melhor não arriscar.");
					break;
				case 4:
					System.out.println("Você encontrou diamantes.");
					break;
				case 5:
					System.out.println("VOCÊ CAIU NA LAVA!! Volte ao início.");
					jogador1 = 0;
					break;
				case 6:
					System.out.println("Você encontrou diamantes em uma caverna.");
					break;
				case 7:
					System.out.println("BOOOMMMM!! Creeper explodiu do seu lado, volte do inicio.");
					jogador1 = 0;
					break;
				case 8:
					System.out.println("Você encontrou minérios.");
					break;
				case 9:
					System.out.println("VOCÊ ENTROU NO END.");
					break;
				case 10:
					System.out.println("Você colocou uma cama e você sofreu dano, volte duas casas.");
					jogador1 -= 2;
					break;
				case 11:
					System.out.println("Você acertou uma flecha no dragão.");
					break;
				case 12:
					System.out.println("Você destruiu a torre de cura.");
					break;
				case 13:
					System.out.println("O dragão está se aproximando.");
					break;
				case 14:
					System.out.println("O enderdragon te matou, volte a casa 9.");
					jogador1 = 8;
					break;
				case 15:
					System.out.println("Você matou o enderdragon, parabéns!");
					break;
				}
	
				System.out.println("\nJogador 2, é a sua vez. Pressione enter para jogar o dado.");
				input.nextLine();
				jogada = (int) (Math.random() * 6) + 1;
				jogador2 += jogada;
				System.out.println("Você jogou o dado e avançou " + jogada + " casas.");
				if (jogador2 > 14) {
	
					System.out.println("Parabéns, você zerou o Minecraft!");
					break;
				}
				System.out.println("Você está na casa " + tabuleiro[jogador2 - 1] + ".");
	
				switch (jogador2) {
				case 1:
					System.out.println("Está de noite, você se escondeu em uma caverna e dormiu.");
					break;
				case 2:
					System.out.println("Você encontrou uma recompensa em uma vila.");
					break;
				case 3:
					System.out.println("FIQUE ONDE ESTÁ! Há monstros por perto, é melhor não arriscar.");
					break;
				case 4:
					System.out.println("Você encontrou diamantes.");
					break;
				case 5:
					System.out.println("VOCÊ CAIU NA LAVA!! Volte ao início.");
					jogador2 = 0;
					break;
				case 6:
					System.out.println("Você encontrou diamantes em uma caverna.");
					break;
				case 7:
					System.out.println("BOOOMMMM!! Creeper explodiu do seu lado, volte do inicio.");
					jogador2 = 0;
					break;
				case 8:
					System.out.println("Você encontrou minérios.");
					break;
				case 9:
					System.out.println("VOCÊ ENTROU NO END.");
					break;
				case 10:
					System.out.println("Você colocou uma cama e você sofreu dano, volte duas casas.");
					jogador2 -= 2;
					break;
				case 11:
					System.out.println("Você acertou uma flecha no dragão.");
					break;
				case 12:
					System.out.println("Você destruiu a torre de cura.");
					break;
				case 13:
					System.out.println("O dragão está se aproximando.");
					break;
				case 14:
					System.out.println("O enderdragon te matou, volte a casa 9.");
					jogador2 = 8;
					break;
				case 15:
					System.out.println("Você matou o enderdragon, parabéns!");
					break;
				}
	
			}
			input.close();
		}
	}