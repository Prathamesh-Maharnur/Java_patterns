class Pattern16{
	
	public static int factorial(int i){
		if(i == 0){
			return 1;
		}
		return i * factorial(i-1);
	}
	
	public static void main(String[] args){
		int n =5;
		
		for(int i = 0; i<n; i++){
			for(int j = 1; j<n-i; j++){
				System.out.print(" ");
			}
			
			for(int j =0; j<=i; j++){
				int num = factorial(i) / (factorial(i-j) * factorial(j));
				System.out.print(num+" ");
			}
			
			System.out.println();
		}
	}
	
}