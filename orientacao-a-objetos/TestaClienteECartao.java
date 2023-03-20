class TestaClienteECartao{
    public static void main(String[] args){
         Cliente c = new Cliente();
         CartaoDeCredito cdc =new CartaoDeCredito();
         c.nome = "Cristiano";
         cdc.numero = 111111;
        //fazendo a ligação entre os objetos cartão de credito e cliente;
         cdc.cliente = c;

         System.out.println(cdc.numero);
         System.out.println(cdc.cliente.nome);
    }
}