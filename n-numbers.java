public class n-numbers {
    public static void main(String[] args) {

					  Scanner sc=new Scanner(System.in);
					  int N= sc.nextInt();
					  int Bull[]=new int[N];
					  for (int i=0;i<N;i++){
						  Bull[i]=sc.nextInt();
					  	}
						  int count=1;
						  int prevBul=Bull[0];
						  for(int i=0;i<N;i++){
							  	if (prevBul<Bull[i]){
									  count++;
									  prevBul=Bull[i];
								  }
						  	}
							  System.out.println(count);

	}
}
    }
}
