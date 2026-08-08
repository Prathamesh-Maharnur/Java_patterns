class Pattern33{
	public static void main(String[] args){
		int n=5, count=1;
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=i; j++){
				
				if(count%2 !=0){
					System.out.printf("%c", (char)(97+count-1));
				}else{
					System.out.printf("%c", (char)(65+count-1));
				}
				count++;
			}
			
			System.out.println();
		}
	}
}