import java.util.*;
public class UnionOfSortedArray {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i = 0 , j = 0;
		int n = a.length, m = b.length;
		ArrayList<Integer> list = new ArrayList<>();
		while(i<n && j<m){
			if(a[i]<=b[j]){
				if(list.size()==0 || a[i]!= list.get(list.size()-1)){
					list.add(a[i]);
				}
				i++;
			}
			else{
				if(list.size()==0 || b[j]!=list.get(list.size()-1)){
					list.add(b[j]);
				}
				j++;
			}
		}
		while(i<n){
			if(a[i]!= list.get(list.size()-1)){
					list.add(a[i]);
				}
				i++;
		}
		while(j<m){
			if(b[j]!=list.get(list.size()-1)){
					list.add(b[j]);
				}
				j++;
		}
		return list;
    }
}