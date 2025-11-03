import java.util.ArrayList;
import java.util.Scanner;

public class Produtos{

    public static void mostrarLista(ArrayList <String> lista){
        for (String mostrar : lista){
            System.out.println(lista.indexOf(mostrar)+". "+ mostrar);
        }
    }

    public static void adicionarItem(ArrayList<String> lista, String item){
        lista.add(item);
    }

    public static void removerItem(ArrayList<String> lista, int index){
        lista.remove(index);
    }

    public static void exibirMenu(){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Mostrar lista 2 - Adicionar item 3 - Remover item 4 - Sair");
        int respostaUsuario = sc.nextInt(); 

        while(flag == true){
            switch (respostaUsuario) {
                case 1:
                    Produtos.mostrarLista();
            }
        }
    }


}
