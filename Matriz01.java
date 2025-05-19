public class Matriz01
{
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
       
       int numLinhas = matriz.length;
       int numColunas = matriz[0].length;
       
        matriz[0][0] = 5;
        matriz[0][1] = 3;
        matriz[0][2] = 2;
        matriz[0][3] = 1;

        matriz[1][0] = 4;
        matriz[1][1] = 3;
        matriz[1][2] = 6;
        matriz[1][3] = 2;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 1;
        matriz[2][3] = 5;
        
        matriz[3][0] = 9;
        matriz[3][1] = 6;
        matriz[3][2] = 3;
        matriz[3][3] = 2;
        
        System.out.println("Número de linhas: " + numLinhas);
        System.out.println("Número de colunas: " + numColunas);

        System.out.println("\nMatriz 4x4:");
        for (int i = 0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + " ");
        }
        System.out.println();
        }
    }
}
