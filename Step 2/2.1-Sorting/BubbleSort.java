import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {34,1,0,76,55,1000000,99,12,44};
        int a = 0;
        while(a<arr.length){
            int t = 0, b = a + 1;
            while(b<arr.length){
                if(arr[a]>arr[b]){
                    t = arr[a];
                    arr[a] = arr[b];
                    arr[b] = t;
                }
                b++;
            }
            a++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
