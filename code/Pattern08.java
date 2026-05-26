class Pattern08{
	public static void main(String[] args){
		int n=5;
		
		for(int i=1; i<2*n; i=i+2){
				
			for(int j=1; j<2*n-i; j=j+2){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}