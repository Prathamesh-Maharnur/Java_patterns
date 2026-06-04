class Pattern14{
	public static void main(String[] args){
		int n=5;
		
		for(int i=0; i<n; i++){
			
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			
			int width = 2*(n-i)-1;
			for(int j=0; j<width; j++){
				if(j==0 || j==width-1 || i==0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}

