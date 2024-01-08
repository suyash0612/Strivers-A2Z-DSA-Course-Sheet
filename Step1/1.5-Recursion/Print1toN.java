public class Print1toN {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int a[] = new int[x];
        a = recursion(a,x);
        return a;
    }

    public static int[] recursion(int a[],int x){
        if(x>0){
            a[x-1] = x;
            x--;
            recursion(a,x);
        }
        return a;
    }
}
