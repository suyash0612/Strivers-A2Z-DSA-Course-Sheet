public class GCD {
    public static int calcGCDM1(int n, int m){
        // Write your code here.
        int l = (n>m) ? m : n;
        int gcd = 1;
        for(int i = 1 ; i <= l;i++){
            if(m%i==0 && n%i==0){
                gcd = i;
            }
        }
        return gcd;
    
    }

    public static int best(int n, int m){
        // Write your code here.
        while(m>0 && n > 0){
            if(m>n) m = m % n;
            else n = n % m;
        }
        if(n==0) return m;
        else return n;
    }
    public static void main(String[] args) {
        calcGCDM1(3,6);
        best(12,26);
    }
}
