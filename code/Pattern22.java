class Pattern22{
	
	public static void main(String[] args){
		int n=5;
		boolean flag = true;
		
		for(int i=1; i<=n; i++){
			
			if(i%2!=0){
				flag =true;
			}
			for(int j=1; j<=i; j++){
				if(flag){
					System.out.print("1 ");
				}else{
					System.out.print("0 ");
				}
				flag = !flag;
			}
			
			System.out.println();
		}
		
	}
}