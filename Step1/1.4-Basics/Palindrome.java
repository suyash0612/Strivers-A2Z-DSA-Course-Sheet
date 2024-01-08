class isPalindrome {
    public static boolean isNumPalindrome(int x) {
        if(x<0) return false;
        else{
            int sum = 0; int n = x;
            while(n!=0){
                int r = n % 10;
                sum = sum * 10 + r;
                n /= 10;
            }
            if(sum == x) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        isNumPalindrome(-101);
    }
}