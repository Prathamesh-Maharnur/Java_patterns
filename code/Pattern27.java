class Pattern27{
	public static void main(String[] args){
		
		int n=4, count1=1,range, count2;
		range = n*(n+1);
		
		for(int i =1; i<=n; i++){
			
			for(int j=1; j<i; j++){
				System.out.print("    ");
			}
			
			
			for(int j=0; j<=n-i; j++){
					System.out.printf("%3d ", count1);
				count1++;
			}
			
			System.out.print(" ");
			
			count2 = range-n+i;
			range=count2-1;
			for(int j=0; j<=n-i; j++){
			System.out.printf("%3d ", count2);
				count2++;
			}
			
			
			System.out.println();
		}
	}
}