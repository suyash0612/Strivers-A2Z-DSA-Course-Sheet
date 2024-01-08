import java.util.*;

class ArmstrongNumber{
    
    public static void M1() {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int temp = n;
		int len = 0; int sum = 0;
		while(temp!=0){
			temp/=10;
			len++;
		}
		temp = n;
		while(temp!=0){
			int r = temp % 10;
			sum+= Math.pow(r,len);
			temp/=10;
		}
		boolean status = (sum == n) ? true : false;
		System.out.println(status);
		sc.close();
    }
    

    public static void M2() {
        // Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int temp = n;
		int s = 0;
		String str = String.valueOf(n);
		int l = str.length();
		while(n!=0){
			int r = n % 10;
			s+= Math.pow(r,l);
			n/=10;
		}
		boolean st = (s == temp)? true : false;
		System.out.print(st);
		sc.close();
    }

    
    public static void main(String[] args) {
        // Write your code here
		M1();
        M2();
    }
}