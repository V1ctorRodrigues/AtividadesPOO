public class Exerc6 {
    public static int somarMatriz (int [][] arrayInteiro){
        int soma = 0;
        for(int i = 0; i<arrayInteiro.length ; i++){
            for(int j = 0; j<arrayInteiro[i].length; j++){
                soma += arrayInteiro[i][j] ;
            }
        }
        return soma;
    }
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("A soma de todos os índices da matriz é = " + somarMatriz(matriz));
    }
    
}
