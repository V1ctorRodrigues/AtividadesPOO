import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float preco;
        float desconto;
        float valor;
        int quantidade;

        System.out.println("Informe o preço do produto");
        preco = sc.nextFloat();
        System.out.println("Informe a quantidade de produtos");
        quantidade = sc.nextInt();
        valor = preco*quantidade;
        if(quantidade > 4){
            desconto = valor*0.1f;
            System.out.println("Valor da compra com desconto: " + (valor - desconto) + "RS");
        } else{
            System.out.println("Valor da compra: " + preco);
        }
    }
}
