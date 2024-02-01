public class SecondLargestNum {
    public static void main(String[] args) {
        int arr[] = {991,991,34,22,56,10,9,9,97,76};
        int max = arr[0]; int min = max;
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max)  max = arr[i];
            if(arr[i]<min)  min = arr[i];
        }
        System.out.println(max + " " + min);

        int smax = min, smin = max;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>smax){
                smax = arr[i];
            }
            if(arr[i]!=min && arr[i]<smin){
                smin = arr[i];
            }
        }
        System.out.println(smax + " " + smin);

        System.out.println(Integer.MIN_VALUE);
    }

}
