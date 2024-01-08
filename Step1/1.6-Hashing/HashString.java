import java.util.*;

class HashString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		int ch[] = new int[26];
		for(int i = 0 ; i< str.length() ; i++){
		    ch[str.charAt(i) - 'a'] += 1;
		}
		int n = sc.nextInt();
		for(int i=0; i<n;i++){
		    System.out.println(ch[sc.next().toLowerCase().charAt(0) - 'a']);
		}
        sc.close();
	}
}
