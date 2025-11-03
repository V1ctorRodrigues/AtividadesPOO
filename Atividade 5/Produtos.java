import java.util.ArrayList;
import java.util.Scanner;

public class Produtos{

    public static void mostrarLista(ArrayList <String> lista){
            for (int i=0 ; i<lista.size(); i ++)
             System.out.println(i +" ."+lista.get(i));
    }

    public static void adicionarItem(ArrayList<String> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do item");
        String novoItem = sc.nextLine();
        lista.add(novoItem);
    }

    public static void removerItem(ArrayList<String> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o índice do produto");
        int index = sc.nextInt();
        if(index >= 0 && index < lista.size()){
            lista.remove(index);
        } 
        else {
            System.out.println("Índice inválido!");
        }
    }

    public static void exibirMenu(){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> generico = new ArrayList<>();
    
        while(flag == true){
            System.out.println("1 - Mostrar lista 2 - Adicionar item \n3 - Remover item 4 - Sair");
            int respostaUsuario = sc.nextInt(); 
            sc.nextLine();
            switch (respostaUsuario) {
                case 1:
                    Produtos.mostrarLista(generico);
                    break;
                case 2:
                    Produtos.adicionarItem(generico);
                    break;
                case 3:
                    Produtos.removerItem(generico);
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
