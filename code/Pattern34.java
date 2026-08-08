class Pattern34{
	public static void main(String[] args){
		
		int n=5;
		char c;
		
		for(int i=1; i<=n; i++){
			c = (char)(65+n-i);
			for(int j=0; j<=n-i; j++){
				System.out.printf("%c ", c-j);
			}
			
			System.out.println();
		}
	}
}