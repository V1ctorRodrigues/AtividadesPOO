import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoLitro, valorTotal, valorFinal = 0;
        String combustivel;

        System.out.println("Selecione o combustível: \nG - Gasolina  A - Álcool");
        combustivel = sc.nextLine();

        System.out.println("Informe a quantidade em litros:");
        float quantidade = sc.nextFloat();

        
        if (combustivel.equalsIgnoreCase("G")) {
            precoLitro = 6.00;
        } else if (combustivel.equalsIgnoreCase("A")) {
            precoLitro = 4.50;
        } else {
            System.out.println("Tipo de combustível inválido.");
            sc.close();
            return;
        }

        valorTotal = quantidade * precoLitro;

        
        if (combustivel.equalsIgnoreCase("G")) {
            if (quantidade <= 20) {
                valorFinal = valorTotal - (valorTotal * 0.03);
            } else {
                valorFinal = valorTotal - (valorTotal * 0.05);
            }
        } else if (combustivel.equalsIgnoreCase("A")) {
            if (quantidade <= 20) {
                valorFinal = valorTotal - (valorTotal * 0.04);
            } else {
                valorFinal = valorTotal - (valorTotal * 0.06);
            }
        }

        System.out.printf("O valor total com desconto é: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
