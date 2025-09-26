import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a idade do nadador?");
        int idade = sc.nextInt();

        switch (idade){
            case 5, 6, 7 -> System.out.println("Infantil A");
            case 8, 9, 10 -> System.out.println("Infantil B");
            case 11, 12, 13 -> System.out.println("Juvenil A");
            case 14, 15, 16, 17 -> System.out.println("Juvenil B");
        }
        if (idade >= 18){
            System.out.println("Modalidade Adulto");
        } else if(idade <= 4){
            System.out.println("Idade não aceita pelo regulamento");
        }
        sc.close();
    }
}
