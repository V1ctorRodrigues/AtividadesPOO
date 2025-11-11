import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private boolean flag = false;
    private ControleFuncionario controle = new ControleFuncionario();


    public void exibirMenu(){
        while (flag == false) {
            System.out.println("1 - Adicionar Gerente 2 - Adicionar Atendente");
            System.out.println("3 - Listar todos os funcionários 4 - Mostrar salários");
            System.out.println("5 - Sair");
            int resposta = sc.nextInt();
            sc.nextLine();

            switch (resposta) {
                case 1:
                    System.out.println("Informe o nome do Gerente:");
                    String nome = sc.nextLine();
                    System.out.println("Informe o CPF do Gerente:");
                    String CPF = sc.nextLine();
                    System.out.println("Informe salário do Gerente:");
                    double salario = sc.nextDouble(); 
                    sc.nextLine();
                    System.out.println("Informe a data de aniversário(digite dia-mes-ano):");
                    String dataTexto = sc.nextLine();
                    LocalDate aniversario = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    String cargo = "Gerente";

                    Gerente novoGerente = new Gerente(nome, CPF, salario, aniversario, cargo);
                    novoGerente.bonusSalario();
                    controle.addFuncionario(novoGerente);

                    break;

                case 2:
                    System.out.println("Informe o nome do Atendente:");
                    String nomeA = sc.nextLine();
                    System.out.println("Informe o CPF do Atendente:");
                    String CPFA = sc.nextLine();
                    System.out.println("Informe salário do Atendente:");
                    double salarioA = sc.nextDouble(); 
                    sc.nextLine();
                    System.out.println("Informe a data de aniversário do Atendente:");
                    String dataTextoA = sc.nextLine();
                    LocalDate aniversarioA = LocalDate.parse(dataTextoA, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    System.out.println("Informe o valor total de vendas feitas:");
                    double vendas = sc.nextDouble();
                    String cargoA = "Atendente";

                    Atendente novoAtendente = new Atendente(nomeA, CPFA, salarioA, aniversarioA, cargoA, vendas);
                    novoAtendente.comissao();
                    controle.addFuncionario(novoAtendente);

                    break;

                case 3: 
                    controle.mostrarFuncionarios();
                    break;

                case 4: 
                    System.out.println("Informe o CPF do funcionário:");
                    String buscarCpf = sc.nextLine();
                    controle.mostrarSalario(buscarCpf);
                    break;
                case 5:
                    flag = true;
                    break;
            }    
        }
    }
}