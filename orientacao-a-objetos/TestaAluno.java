class TestaAluno{
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Cristiano";
        a1.rg = "11111111as";
        a1.data_de_nascimento = "21/03/2023";

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