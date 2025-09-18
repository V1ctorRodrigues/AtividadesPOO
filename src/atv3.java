
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Idade;
        
        System.out.println("Digite sua idade");
        Idade = sc.nextInt();

        if(Idade >= 18){
            System.out.println("Você é maior de idade.");
        } else if(Idade< 18){
            System.out.println("Você é menor de idade.");
        }
    }
}