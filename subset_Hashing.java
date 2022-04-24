import java.util.HashSet;

public class isSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
		//Output: arr2[] is a subset of arr1[]
		
		int arr[] = {11, 1, 13, 21, 3, 7};
		int arr3[] = {11, 3, 7, 1,56} ;
		
		HashSet<Integer> s = new HashSet<>();
		for (int i=0;i<arr.length;i++) {
			if(!s.contains(arr[i])) {
				s.add(arr[i]);
			}
			
		}
		boolean ans=true;
		for (int j=0;j<arr3.length;j++) {
			if(!s.contains(arr3[j])) {
				ans=false;
			}
			
		}
		System.out.println(ans);
	}

}
