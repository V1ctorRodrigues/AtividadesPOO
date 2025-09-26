import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;

        System.out.println("Informe a primeira nota:");
        nota1 = sc.nextFloat();
        System.out.println("Informe a segunda nota");
        nota2 = sc.nextFloat();

        media = (nota1+nota2)/2;

        if(media >= 7){
            System.out.println("Você foi aprovado!");
        } else if(media < 7 && media >= 4){
            System.out.println("Você está em recuperação.");
        } else if(media < 4){
            System.out.println("Você foi reprovado.");
        }

    }

}
    
