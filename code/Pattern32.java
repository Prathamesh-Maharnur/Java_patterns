class Pattern32{
	public static void main(String[] args){
		
		int n=5;
		char c = (char)(65+n);
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=i; j++){
				System.out.printf("%c",c-i+j-1);
			}
			
			System.out.println();
		}
		
	}
}