class HashNum
{
    public static int[] FrequencyChecker(int a[]){
        int hash[] = new int[a.length];
        
        for(int i = 0 ; i<a.length;i++){
            hash[a[i]] += 1;
        }
        return hash;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {1, 3, 2, 1, 3};
		int hash[] = FrequencyChecker(a);
		for(int i = 0 ; i< hash.length ; i++){
		    System.out.println(i + " : " + hash[i]);
		}
		
	}
}
