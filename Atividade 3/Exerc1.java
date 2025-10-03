
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double resposta = 0;
    double notas = 0;
    int contador = 0;

    System.out.println("Informe as notas do aluno(-1 para sair): ");

    while (resposta != -1) {
        resposta = scanner.nextDouble();
        if(resposta == -1){
            break;
        }
        notas = notas+resposta;
        contador++; 
    }
    double média = (notas/contador);
    System.out.println(média);
    }
}