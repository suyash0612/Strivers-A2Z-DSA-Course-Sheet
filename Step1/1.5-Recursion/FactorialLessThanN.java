import java.util.List;
import java.util.*;

public class FactorialLessThanN {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> lt = new ArrayList<Long>();
        for(long i = 1; i <= n ; i++){
            long factorial = fact(i);
            if(factorial <= n){
                lt.add(factorial);
            }
            else break;
        }
        return lt;

    }

    public static long fact(long f){
        if(f==0 || f == 1){
            return 1;
        }
        return f * fact(f - 1);
    }
}