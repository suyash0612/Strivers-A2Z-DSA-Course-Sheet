class Fibonnaci {
    // By Recursion
    public int fib1(int n){
        if(n > 1) return fib1(n - 1) + fib1(n - 2);
        else return n;
    }

    // By Loop --> Best case solution
    public int fib2(int n) {
        int a[] = new int[2];
        a[0] = 0; a[1] = 1;
        if(n==0 || n==1) return a[n];
        
        for(int i = 2; i<= n; i++){
            int temp = a[1];
            a[1] = a[0] + a[1];
            a[0] = temp;
        }
        
        return a[1];
    }
}