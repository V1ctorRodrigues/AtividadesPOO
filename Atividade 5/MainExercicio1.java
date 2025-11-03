import java.util.ArrayList;
import java.util.Scanner;

public class MainExercicio1 {
     public static void main(String[] args) {
          ArrayList<String> compras = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
          Produtos.exibirMenu(sc);
          sc.close();
     }
}
