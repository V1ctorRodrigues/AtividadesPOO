public class Exerc3 {
    public static int maiorArray (int[] arrayGenerico){
        
        int maior = 0;
        for(int i=0 ; i<arrayGenerico.length ; i++){
            if(arrayGenerico[i]>maior){
                maior = arrayGenerico[i];
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        int [] numeros = {12, 34, 55, 1, 3, 7};
        System.out.println("O maior valor presente é: " + maiorArray(numeros));
        
    }
    
}
