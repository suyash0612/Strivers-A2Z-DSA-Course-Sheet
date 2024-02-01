public class LargestNum {
    public static void main(String[] args) {
        int arr[] = {4,4,2,6,9,8,10,1,2,4};
        int max = 0;
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max)  max = arr[i];
        }
        System.out.println(max);
    }
}
