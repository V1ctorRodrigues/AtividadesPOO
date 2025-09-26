import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String masculino = "m";
        String feminino = "f";
        String resposta;
        float ingresso = 85.00f;
        float desconto = ingresso - (ingresso * 0.3f);

        System.out.println("Informe seu sexo \nM - Masculino F - Feminino");
        resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase(masculino)){
            System.out.println("O valor do seu ingresso é de: " + ingresso + "R$");
        } else if(resposta.equalsIgnoreCase(feminino)){
            System.out.println("O valor do seu ingresso é de: " + desconto + "R$");
        }
    }
    
}
