import java.util.ArrayList;
import java.util.Scanner;

public class Produtos{

    public static void mostrarLista(ArrayList <String> lista){
        System.out.println();
        if(lista.isEmpty() == true){
            System.out.println("A lista está vazia");
            System.out.println();
        } else{
            for (int i=0 ; i<lista.size(); i ++)
                System.out.println(i +". "+lista.get(i));
                System.out.println();
            }
    }

    public static void adicionarItem(ArrayList<String> lista , Scanner sc){
        System.out.println();
        System.out.println("Informe o nome do item");
        String novoItem = sc.nextLine();
        System.out.println();
        lista.add(novoItem);
    }

    public static void removerItem(ArrayList<String> lista , Scanner sc){
        System.out.println();
        System.out.println("Informe o índice do produto");
        int index = sc.nextInt();
        if(index >= 0 && index < lista.size()){
            lista.remove(index);
        } 
        else {
            System.out.println("Índice inválido!");
        }
    }

    public static void exibirMenu(Scanner sc){
        boolean flag = true;
        ArrayList<String> generico = new ArrayList<>();
    
        while(flag == true){
            System.out.println("1 - Mostrar lista 2 - Adicionar item \n3 - Remover item  4 - Sair");
            int respostaUsuario = sc.nextInt(); 
            sc.nextLine();
            switch (respostaUsuario) {
                case 1:
                    Produtos.mostrarLista(generico);
                    break;
                case 2:
                    Produtos.adicionarItem(generico, sc);
                    break;
                case 3:
                    Produtos.removerItem(generico, sc);
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}