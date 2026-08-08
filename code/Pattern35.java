class Pattern35{
	public static void main(String[] args){
		
		int n=4, count;
		
		for(int i=1; i<=n; i++){
			
			count=0;
			
			for(int j=1; j<=2*n; j++){
					
					if(j<=i){
						count++;
						System.out.print(count);
					}else if(j>2*n-i){
						System.out.print(count);
						count--;
					}else{
						System.out.print(" ");
					}
					
				}
				
			
			System.out.println();
		}
	}
}