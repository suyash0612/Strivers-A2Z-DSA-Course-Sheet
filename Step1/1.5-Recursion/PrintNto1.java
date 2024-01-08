public class PrintNto1 {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int a[] = new int[x];
        return recursion(a,x);
    }

    public static int[] recursion(int a[],int x) {
        // Write Your Code Here
        if(x>0){
            a[a.length - x] = x;
            x--;
            recursion(a,x);
        }
        return a;
    }
}
