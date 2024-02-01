import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4, 9, 6, 0, 4, 8, 3, 2, 1};
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pind = getSortedPivotIndex(arr, low, high);
            quicksort(arr, low, pind - 1);
            quicksort(arr, pind + 1, high);
        }
    }

    public static int getSortedPivotIndex(int arr[], int low, int high) {
        int pivot = arr[low], i = low, j = high;
        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swapNumbers(arr, i, j);
            }
        }
        swapNumbers(arr, low, j);
        return j;
    }

    public static void swapNumbers(int arr[], int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
