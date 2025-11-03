import java.util.ArrayList;

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


}
