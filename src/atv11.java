import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        int num1;
        int num2;

        System.out.println("Digite dois números inteiros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        resultado = num1+num2;
        System.out.println("A soma é: " + resultado);

        resultado = num1-num2;
        System.out.println("A subtração é: " + resultado);

        resultado = num1*num2;
        System.out.println("A multiplicação é: " + resultado);

        resultado = num1/num2;
        System.out.println("A divisão é: " + resultado);
    }
}
