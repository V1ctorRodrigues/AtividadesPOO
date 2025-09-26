import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("Informe um número qualquer: ");
        double resposta = sc.nextDouble();

        while(i<=10){
            System.out.printf("%.2f%s%d%s%.1f%n", resposta , " * ", i, " = ", resposta*i);
            i++;
        }
    } 
}
