public class Sum1toN {
    public static long sumFirstN(long n) {
        // Write your code here.
        return n * (n + 1) / 2;
    }

    public static long sumFirstN2(long n) {
        // Write your code here.
        if(n == 1){
            return 1;
        }
        return n + sumFirstN2(n-1);
    }
}
