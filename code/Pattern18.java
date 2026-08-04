class Pattern18{

	public static void main(String[] args){
		int n=5;
		
		for(int i=0; i<2*n; i++){
			
			int stars = i<n ? n-i: i==n ? 1 : i-n+1;
			int spaces = n-stars;
			
			for(int j=1; j<=stars; j++){
				System.out.print("*");
			}
			
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=stars; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}