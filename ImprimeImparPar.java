class ImprimeImparPar {
    public static void main(String[] args){
        for(int i = 1; i <=100; i++){
            int resto = i % 2;
            if(resto == 1){
                System.out.println("*");
            }
            else{
                System.out.println("**");
            }
        }
    }
}