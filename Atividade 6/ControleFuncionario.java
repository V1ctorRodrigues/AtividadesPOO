import java.util.ArrayList;

public class ControleFuncionario{
    private ArrayList <Funcionario> funcionarios = new ArrayList<>();

    public void addFuncionario(Funcionario novoFuncionario){
        funcionarios.add(novoFuncionario);
    }

    public void mostrarFuncionarios(){
        for(int i=0; i<funcionarios.size(); i++){
            System.out.println(funcionarios.get(i));
        }
    }
    public void removerFuncionario(int remover){
        if(remover>= 0 && remover<funcionarios.size()){
            funcionarios.remove(remover);
        }else{
            System.out.println("Número inválido");
        }
    }
    public void mostrarSalario(String CPF){
        boolean cpfEncontrado = false;
        for(Funcionario a : funcionarios){
            if(a.getCPF().equalsIgnoreCase(CPF)){
                cpfEncontrado = true;
                System.out.println(a.getNome() + ": " + a.getSalario() + " Reais");
            } 
        }
        if(cpfEncontrado == false){
            System.out.println("Cpf inexistente");
        }
    }
}