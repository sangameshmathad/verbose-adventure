import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class sumTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int [N];
		for (int i=0;i<N;i++) {
			arr[i]= sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(targetSumPair(arr));
	}

	private static int targetSumPair(int[] arr) {
		// TODO Auto-generated method stub
		int l=arr.length;
		int count=0;
		int target =7;
		HashMap<Integer,Integer>map= new HashMap<>();
		for(int i=0;i<l;i++) {
			int Ai= target-arr[i];
			int freQ=map.getOrDefault(Ai, 0);
			count+=freQ;
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		return count;
		
	}
}
