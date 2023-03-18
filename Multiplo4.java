class Multiplo4 {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            int multiplo = i % 4;
            if( multiplo == 0){
                System.out.println("PI");
            }
            else{
                System.out.println(i);
            }
        }
    }
}