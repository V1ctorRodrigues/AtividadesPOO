public class Exerc7 {

    public static int menorValorMatriz (int [][] matrizGenerica){
        int menorValor = Integer.MAX_VALUE;
        for(int i=0 ; i<matrizGenerica.length ; i++){
            for(int j=0 ; j<matrizGenerica[i].length ; j++){
                if(menorValor > matrizGenerica [i][j]){
                    menorValor = matrizGenerica[i][j];
                }
            }
        } return menorValor;
    }    
    public static void main(String[] args) {
        int[][] matrizTeste = {
            {-12, 1, 7},
            {100, 35, -122},
            {7, 8, 3}
        };

        System.out.print("O menor valor obtido foi: ");
        System.out.println(menorValorMatriz(matrizTeste));
    }
    
}
