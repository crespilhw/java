import java.util.Scanner;
public class JogoDaVelha
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String [][] tabuleiro = new String[3][3];
		boolean vencedor;
		int linhaJogador, colunaJogador;
		
		
		for(int i = 0; i < tabuleiro.length; i++){
		    for(int j = 0; j < tabuleiro[i].length; j++){
		        tabuleiro[i][j] = "( )";

		    }
		    System.out.println(" ");
		}
		
		while(true){
            for(int linha = 0; linha < 3; linha++){
                for (int coluna = 0; coluna < 3; coluna++ ){
                    System.out.print((tabuleiro[linha][coluna]));
                }
                System.out.println();
            }
        while(true){
            System.out.println("Qual deseja preencher? Jogador 1");
            linhaJogador = ler.nextInt() - 1;
            colunaJogador = ler.nextInt() - 1;
                if (tabuleiro[linhaJogador][colunaJogador] == "( )") {
                    tabuleiro[linhaJogador][colunaJogador] = "(X)";
                    break;
                }
                System.out.println("Preenchimento incorreto, verificar e tentar novamente");
            }
            
            if(tabuleiro[0][0] == "(X)" && tabuleiro[1][0] == "(X)" && tabuleiro[2][0] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[0][1] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[2][1] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[0][2] == "(X)" && tabuleiro[1][2] == "(X)" && tabuleiro[2][1] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[0][0] == "(X)" && tabuleiro[0][1] == "(X)" && tabuleiro[0][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[1][0] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[1][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        else if(tabuleiro[2][0] == "(X)" && tabuleiro[2][1] == "(X)" && tabuleiro[2][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        else if(tabuleiro[0][0] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[2][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        else if(tabuleiro[0][2] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[2][0] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        
        for(int linha = 0; linha < 3; linha++){
                for (int coluna = 0; coluna < 3; coluna++ ){
                    System.out.print((tabuleiro[linha][coluna]));
                }
                System.out.println();
            }
            
        while(true){
            System.out.println("Qual deseja preencher? Jogador 2");
            linhaJogador = ler.nextInt() - 1;
            colunaJogador = ler.nextInt() - 1;
                if (tabuleiro[linhaJogador][colunaJogador] == "( )") {
                    tabuleiro[linhaJogador][colunaJogador] = "(O)";
                    break;
                }
                System.out.println("Preenchimento incorreto, verificar e tentar novamente");
            }
            if(tabuleiro[0][0] == "(O)" && tabuleiro[1][0] == "(O)" && tabuleiro[2][0] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }else if(tabuleiro[0][1] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[2][1] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }else if(tabuleiro[0][2] == "(O)" && tabuleiro[1][2] == "(O)" && tabuleiro[2][1] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[0][0] == "(O)" && tabuleiro[0][1] == "(O)" && tabuleiro[0][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }else if(tabuleiro[1][0] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[1][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[2][0] == "(O)" && tabuleiro[2][1] == "(O)" && tabuleiro[2][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[0][0] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[2][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[0][2] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[2][0] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
    }
}
    }