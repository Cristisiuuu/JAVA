class TestaAluno{
    public static void main(String[] args){
        Turma t1 = new Turma();
        Aluno a1 = new Aluno();
        //colocando o objeto turma;
        t1.periodo = "manhã";
        t1.serie = "9° ano";
        t1.sigla = "9° A";
        t1.tipo_ensino = "Fundamental";
        //colocando o objeto Aluno
        a1.nome = "Cristiano";
        a1.rg = "11111111as";
        a1.data_de_nascimento = "21/03/2023";
        //fazendo a relação entre os objetos
        a1.turma = t1;
        //dando o print
        System.out.println(a1.nome);
        System.out.println(a1.turma.periodo);
/////////////////////////////////////////criando outro elemento do objeto aluno
        Aluno a2 = new Aluno();
        a2.nome = "Bruno";
        a2.rg = "22222222as";
        a2.data_de_nascimento = "21/03/2023";

        System.out.println(a1.nome);
        System.out.println(a1.rg);
        System.out.println(a1.data_de_nascimento);

        System.out.println(a2.nome);
        System.out.println(a2.rg);
        System.out.println(a2.data_de_nascimento);
    }
}