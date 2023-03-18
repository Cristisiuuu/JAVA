class Fibonacci {
    public static void main(String[] args) {
        int vezesquerepete = 30; 
        int t1 = 0;
        int t2 = 1;
        for (int i = 1; i <= vezesquerepete ; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
