import java.time.LocalDate;

public class Gerente extends Funcionario{

    public Gerente(String nome, String CPF, double salario, LocalDate aniversario){
        super(nome, CPF, salario, aniversario);
    }

    public double bonusSalario(){
        return getSalario() + 2000.00;
    }
    
}
