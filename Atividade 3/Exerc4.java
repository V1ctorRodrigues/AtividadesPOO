public class Exerc4 {

    public static boolean elementoExiste (String[] arrayStrings , String busca){
        for(int i= 0 ; i<arrayStrings.length ; i++){
            if(arrayStrings[i].equals(busca)){
                return true;
            }
        } return false;        
    }
    public static void main(String[] args) {
        String[] meuArray = {"Eu amo Java", "estou estudando", "SOCORRO!"};
        System.out.println(elementoExiste(meuArray, "SOCORRO!"));
    }
    
}
