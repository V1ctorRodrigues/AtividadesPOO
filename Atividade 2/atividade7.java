import java.util.Scanner;

public class atividade7 {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra:");
        String palavra = sc.nextLine();
        int tamanho = palavra.length();

        String invertida = "";

        for( int  i = tamanho-1 ; i>=0; i--){
            char a = palavra.charAt(i);
            invertida = invertida + a;
        }

        System.out.println(invertida);
    }
}
