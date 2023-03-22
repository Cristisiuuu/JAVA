class Funcionario {
    String nome;
    String cargo;
    float salario;

    void aumentaSalario(double valor) {
        this.salario += valor;
    }

    void imprimeDados() {
        System.out.println("NOME: " + this.nome);
        System.out.println("CARGO: " + this.cargo);
        System.out.println("SALARIO: " + this.salario);
    }
}