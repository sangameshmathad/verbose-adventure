import java.util.ArrayList;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,6,9,10,15,19,22,25,27,28,29,65,69};
		int target = 169;
		 int ans = searchthis(arr,target); 
		 System.out.println(ans);
		//ArrayList <Integer> ab = new ArrayList<>();
	}

	private static int searchthis(int[] arr,  int target) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if (arr[mid]<target) {
				start=mid+1;
			}
			if (arr[mid]>target) {
				end=mid-1;
			}
			if(arr[mid]==target) {
				return mid;
			}
		}
		return -1;
		
	}

	

}
