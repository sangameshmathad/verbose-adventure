import java.util.Arrays;

public class rearrange {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 int [] arr = {5,6,7,8,1,2,3,14,12,13,15,19,18,11,10};
		 arrangethis(arr);
		 System.out.println(Arrays.toString(arr));
		 
	}

	private static void arrangethis(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right = arr.length-1;
		while(left<right) {
			if (arr[left]%2==0) {
				left++;
				System.out.println(left);
			}
			if (arr[right]%2!=0) {
				right--;
				System.out.println(right);
			}
			if(left<right) {
				int x = arr[right];
				arr[right]=arr[left];
				arr[left]=x;
			}
		}
		
	}

}
