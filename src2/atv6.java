public class atv6 {
    public static void main(String[] args) {
        String [] nomes = {"Ana", "Bruno", "Alê", "Aline", "Clara"};
        String a = "a";

        for (String nome : nomes){
            if(nome.startsWith("A")){
                System.out.println(nome);
            }
        }
    }  
}
