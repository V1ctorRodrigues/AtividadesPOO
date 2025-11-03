import java.util.ArrayList;

public class Exercicio1 {
     public static void main(String[] args) {
          ArrayList<String> produtos = new ArrayList<>();
          int resposta = 1;
          int respostaTeclado;
          int removerItem;
          String item;
          while(true){
               if(resposta == 0){
                    break;
               }
               else if(resposta!=0){
                    switch(respostaTeclado) {
                         case 1:
                         Produtos.mostrarLista(produtos);
                         case 2:
                         Produtos.adicionarItem(produtos, item);
                         case 3: 
                         Produtos.removerItem(produtos, removerItem);
                    }
               }
          }
     }
}
