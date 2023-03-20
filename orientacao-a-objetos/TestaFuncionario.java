class TestaFuncionario{
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.cargo = "CEO";
        f1.salario = 50000;

        Funcionario f2 = new Funcionario();
        f2.cargo = "Manager";
        f2.salario = 30000;

        System.out.println(f1.cargo);
        System.out.println(f1.salario);

        System.out.println(f2.cargo);
        System.out.println(f2.salario); 
    }
}