package com.paulo;

public class App 
{
    public static void main( String[] args )
    {
        // Departamento[] departamento = new Departamento[10];
        // Funcionario[] funcionario = new Funcionario[100];

        // 1 - Cria uma empresa 
        Empresa empresa = new Empresa("PauloCar", "159.951.0001-90");

        // 2 - Adicione a essa empresa um departamento

        Departamento dep1 = new Departamento("Operacao");
        Departamento dep2 = new Departamento("Financeiro");

        empresa.setDepartamento(dep1);

        // 3 - Adicione aos departamento alguns funcionarios

        Funcionario funcionario = new Funcionario("Paulo", 3000.00f, "23/05/1990"); 
        Funcionario funcionario2 = new Funcionario("Joao", 900.00f, "27/09/1995");
        Funcionario funcionario3 = new Funcionario("Pedro", 2500.00f, "01/01/1999");

        dep1.setFuncionario(funcionario);
        dep1.setFuncionario(funcionario3);

        dep2.setFuncionario(funcionario2);
        

        // 4 - De um aumento de 10% a todos funcionarios de determinado departamento

        funcionario.setSalario(3000.00f);
        funcionario.getSalario();
        //System.out.println(funcionario.setSalario(3000.00f));
        System.out.println("Salario Com Reajuste: " + funcionario.getSalario());


        // 5 - Transfira um funcionario de um departamento para outro

        dep1.removeFuncionario(funcionario3);  //remove o funcionario3 do departamento1
        dep2.addFuncionario(funcionario3); //insere o funcionario3 no departamento2


        System.out.println("\nEmpresa: ");
        System.out.println(empresa.getNome());

        System.out.println("\nFuncionarios da Empresa "+ empresa.getNome()+ ":");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario3.getNome());

        System.out.println("\nDepartamentos da Empresa "+ empresa.getNome()+ "+");
        System.out.println(dep1.getNome());
        System.out.println(dep2.getNome());

        System.out.println("\nFuncionarios do departamento Operacao:");
        for (Funcionario func : dep1.getFuncionario()) {
            System.out.println(func.getNome());
        }

        System.out.println("\nFuncionarios do departamento Financeiro:");
        for (Funcionario func : dep2.getFuncionario()) {
            System.out.println(func.getNome());
        }

    }
}
