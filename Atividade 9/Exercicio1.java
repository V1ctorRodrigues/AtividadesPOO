import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int n1 = Integer.parseInt(teclado.nextLine());

                System.out.print("Digite o segundo número inteiro: ");
                int n2 = Integer.parseInt(teclado.nextLine());

                int resultado = n1 / n2;
                System.out.println("Resultado da divisão: " + resultado);

                break;

            } catch (NumberFormatException e) {
                System.out.println("Erro: você deve digitar apenas números inteiros. Tente novamente.\n");

            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero. Tente novamente.\n");
            }
        }

        teclado.close();
    }
}
