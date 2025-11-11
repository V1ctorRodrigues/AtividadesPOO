import java.time.LocalDate;

public class Atendente extends Funcionario{
    private double vendas;

    public Atendente(String nome, String CPF, double salario, LocalDate aniversario, String cargo,  double vendas){
        super(nome, CPF, salario, aniversario, cargo);
        this.vendas = vendas;
    }  
    
    public double comissao(){
       double comissao = (vendas*0.1);
       setSalario(getSalario() + comissao);
       return getSalario();
    }
}
