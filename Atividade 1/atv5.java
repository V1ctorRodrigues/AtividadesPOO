import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float salarioMin = 1518.00f;
    float resposta;
    float parametro;

    System.out.println("Informe o seu salário");
    resposta = sc.nextFloat();

    parametro = resposta/salarioMin;

    System.out.printf("Você recebe %.3f salários mínimos %n", parametro);
  }
}
