class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Cristiano";
        f1.cargo = "CEO";
        f1.salario = 50000;

        f1.aumentaSalario(1000);
        f1.imprimeDados();
    }
}