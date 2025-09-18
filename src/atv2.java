
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta;
        
        System.out.println("Digite um número inteiro");
        resposta = sc.nextInt();

        System.out.println("Seu antecessor é: " + (resposta-1));
        System.out.println("Seu sucessor é: " + (resposta+1));
    }
}