import java.util.HashMap;
import java.util.Scanner;

public class HashBigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if(hash.containsKey(key))  freq = hash.get(key);
            freq++;
            hash.put(key,freq);    
        }
        int val = sc.nextInt();
        while(val-- != 0){
            int m = sc.nextInt();
            if(hash.containsKey(m)) System.out.println(hash.get(m));
            else System.out.println(0);
        }
        sc.close();
    }
}
