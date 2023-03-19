class TestaCartaoDeCredito{
    public static void main(String[] args){
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.numero = 11111;
        cdc1.data_de_validade ="19/03/2023";

        CartaoDeCredito cdc2 = new CartaoDeCredito();
        cdc2.numero = 22222;
        cdc2.data_de_validade ="19/03/2023";

        System.out.println(cdc1.numero);
        System.out.println(cdc1.data_de_validade);

        System.out.println(cdc2.numero);
        System.out.println(cdc2.data_de_validade);
    }
}