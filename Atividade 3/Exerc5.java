public class Exerc5 {

    public static int [] contarParesImpares(int [] arrayInteiros){
        int pares = 0; int impares = 0;
        int[] resultado = new int [2];
        for(int i=0; i<arrayInteiros.length ; i++){
           int resto = arrayInteiros[i] % 2;

           if(resto == 0){
            pares += 1;
           } 
           else {
            impares += 1;
           }
        }
        resultado[0] = pares; resultado[1] = impares;
        return resultado;
    }
    public static void main(String[] args) {
        int [] arrayInt = {3, 4, 7, 8, 0, 1};
        for (int i = 0 ; i<contarParesImpares(arrayInt).length ; i++){
            System.out.print(contarParesImpares(arrayInt)[i] + " ");
        }
        System.out.println(" ");
    }

}
