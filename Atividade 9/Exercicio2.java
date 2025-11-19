import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.print("Digite seu usuário: ");
        String usuarioDigitado = teclado.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = teclado.nextLine();

        try {
            sistema.fazerLogin(usuarioDigitado, senhaDigitada);

        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        }

        teclado.close();
    }
}