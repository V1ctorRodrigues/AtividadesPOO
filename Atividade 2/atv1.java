import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 70){
            System.out.println("Você é obrigado a votar");
        } else if(idade == 16 || idade == 17 || idade > 70){
            System.out.println("Seu voto é facultativo.");
        } else if(idade>70 || idade < 16){
            System.out.println("Você não pode votar.");
        }
    }
}
