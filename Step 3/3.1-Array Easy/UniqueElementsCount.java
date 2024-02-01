import java.util.HashSet;
import java.util.Set;

public class UniqueElementsCount {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        Set<Integer> uniq = new HashSet<Integer>();
        for (int i : arr) {
            uniq.add(i);
        }
        return uniq.size();
    }
}