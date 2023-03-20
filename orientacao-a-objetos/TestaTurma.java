class TestaTurma{
    public static void main(String[] args){
        Turma t1 = new Turma();
        t1.periodo ="manhã";
        t1.serie = "9°ano";
        t1.tipo_ensino = "Fundamental";
        t1.sigla = "9° A";

        Turma t2 = new Turma();
        t2.periodo ="Tarde";
        t2.serie = "9°ano";
        t2.tipo_ensino = "Fundamental";
        t2.sigla = "9° B";

        System.out.println(t1.periodo);
        System.out.println(t1.serie);
        System.out.println(t1.tipo_ensino);
        System.out.println(t1.sigla);

        System.out.println(t2.periodo);
        System.out.println(t2.serie);
        System.out.println(t2.tipo_ensino);
        System.out.println(t2.sigla);
    }
}