import java.time.LocalDate;

public class Gerente extends Funcionario{

    public Gerente(String nome, String CPF, double salario, LocalDate aniversario, String cargo){
        super(nome, CPF, salario, aniversario, cargo);
    }

    public double bonusSalario(){
        double bonus = 2000.00;
        setSalario(getSalario() + bonus);
        return getSalario();
    }
    
}
