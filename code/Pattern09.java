class Pattern09{
	public static void main(String[] args){
		int n=5;
		
		for(int i=2*n-1; i>=1; i=i-2){
			
			for(int j=1; j<2*n-i; j++){
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}