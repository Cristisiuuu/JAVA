class TestaGerente{
    public static void main (String[] args){
        Gerente g = new Gerente ();
        g.salario = 1500;

        System.out.println("SALÁRIO : "+g.salario);

        System.out.println("Aumento do salário em 10 % ");
        g.aumentaSalario();

        System.out.println("SALÁRIO :"+g.salario);
        
        System.out.println("Aumento do salário em 30 % ");
        g.aumentaSalario(0.3);

        System.out.println("SALÁRIO :"+g.salario);
    }
}