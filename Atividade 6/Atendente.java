import java.time.LocalDate;

public class Atendente extends Funcionario{

    public Atendente(String nome, String CPF, double salario, LocalDate aniversario){
        super(nome, CPF, salario, aniversario);
    }  
    
    public double comissao(double vendas){
       double comissao = (vendas*0.1);
       setSalario(getSalario() + comissao);
       return getSalario();
    }
}
