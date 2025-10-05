public class Exerc8 {
    
    public static double somarDiagonalPrincipal (double [][] matrizQuadrada){
        double soma = 0;
        for(int i=0 ; i<matrizQuadrada.length ; i++){
            soma += matrizQuadrada[i][i];
        }
        return soma;
    }
    public static void main(String[] args) {
        double[][] matrizTeste = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        System.out.print("A soma da diagonal principal é igual a: ");
        System.out.println(somarDiagonalPrincipal(matrizTeste));
    }
}
