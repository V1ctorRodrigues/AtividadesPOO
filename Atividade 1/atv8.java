import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a porcentagem do IPI: ");
        float ipi = sc.nextFloat();

        System.out.print("Informe o código da peça 1: ");
        int codigo1 = sc.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        float valor1 = sc.nextFloat();
        System.out.print("Informe a quantidade da peça 1: ");
        int quantidade1 = sc.nextInt();

        System.out.print("Informe o código da peça 2: ");
        int codigo2 = sc.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        float valor2 = sc.nextFloat();
        System.out.print("Informe a quantidade da peça 2: ");
        int quantidade2 = sc.nextInt();

        float total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        System.out.printf("Valor total a ser pago: R$ %.2f\n", total);
    
    }
}
