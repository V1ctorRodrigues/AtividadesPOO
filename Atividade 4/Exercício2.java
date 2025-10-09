class Aluno{
    String nome;
    int matricula;
    double nota1; double nota2; double notaTrabalho;

    public Aluno(String nome, int matricula, double nota1, double nota2, double notaTrabalho){
        this.nome=nome; this.matricula=matricula; this.nota1=nota1;
        this.nota2=nota2; this.notaTrabalho = notaTrabalho; this.matricula=matricula;
    }

    public double calcularMedia(){
        double media = (nota1+nota2+notaTrabalho)/3;
        return media;
    }

    public void verificarSituacao(){
        if (calcularMedia() >=7){
            System.out.println("APROVADO!");
        } else{
            System.out.println("REPROVADO :(");
        }
    }

}

public class Exercício2 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Victor", 2025123, 1.2, 10, 1);
        Aluno aluno2 = new Aluno("Anderson", 2025124, 7, 7, 7);

        aluno.calcularMedia();
        aluno2.calcularMedia();

        System.out.print("O aluno " + aluno.nome + " foi ");
        aluno.verificarSituacao();
        System.out.print("O aluno " + aluno2.nome + " foi ");
        aluno2.verificarSituacao();
    }
    
}
