import java.time.LocalDate;

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private double salario;
    private LocalDate aniversario;

    public void setNome(String nome){this.nome = nome;}
    public void setCPF(String CPF){this.CPF = CPF;}
    public void setSalario(double salario){this.salario = salario;}
    public void setAniversario(LocalDate aniversario){this.aniversario = aniversario;}

    public String getNome(){return nome;}
    public String getCPF(){return CPF;}
    public double getSalario(){return salario;}
    public LocalDate getAniversario(){return aniversario;}

    public Funcionario(String nome, String CPF, double salario, LocalDate aniversario){
        this.nome = nome; this.CPF = CPF; this.salario = salario; this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               " | CPF: " + CPF +
               " | Salário: " + salario +
               " | Aniversário: " + aniversario;
    }    
}
