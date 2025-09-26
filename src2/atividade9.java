import java.util.Scanner;

public class atividade9 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int resposta = 0;
        int senha_padrao = 1111;
        
        while (resposta != senha_padrao) {
            System.out.println("Informe a senha de 4 dígitos:");
            resposta = scanner.nextInt();
                if(resposta != senha_padrao){
                 System.out.println("Senha negada.");
            } 
        } System.out.println("Acesso permitido");
    }
}