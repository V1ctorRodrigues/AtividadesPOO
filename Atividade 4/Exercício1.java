class Produto{
    String nome;
    double preco;
    int estoque;

    public void exibirInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor: R$" + preco);
        System.out.println("Quantidade disponível: " + estoque);
    }

    public double calcularValorTotalEmEstoque (){
        double valorTotal = preco*estoque;
        return valorTotal;
    }

    public void adicionarEstoque (int adicional){
        estoque = estoque+adicional;
    }

    public Produto(String nome, double preco, int estoque ){
        this.nome = nome; this.preco = preco; this.estoque = estoque;
    }
        
    }


public class Exercício1 {
    public static void main(String[] args) {
        Produto copo = new Produto("Copo", 10.0, 10);
        Produto teclado = new Produto("Teclado", 15.0, 10);

        copo.exibirInfo();
        System.out.print("O valor total em estoque do copo: R$");
        System.out.println(copo.calcularValorTotalEmEstoque());
        System.out.println(" ");


        teclado.exibirInfo();
        System.out.print("O valor total em estoque do copo: R$");
        System.out.println(teclado.calcularValorTotalEmEstoque());
        System.out.println(" ");

        copo.adicionarEstoque(20);
        teclado.adicionarEstoque(20);

        System.out.println("Atualização de estoque: ");
        System.out.println(" ");

        copo.exibirInfo();
        System.out.print("O valor total em estoque do copo: R$");
        System.out.println(copo.calcularValorTotalEmEstoque());
        System.out.println(" ");


        teclado.exibirInfo();
        System.out.print("O valor total em estoque do copo: R$");
        System.out.println(teclado.calcularValorTotalEmEstoque());
        System.out.println(" ");

    }
}
