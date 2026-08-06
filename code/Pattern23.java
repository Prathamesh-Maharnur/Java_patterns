class Pattern23 {

    public static void main(String[] args) {

        int height=3, length=2, n;
		n=height-1;
		
		for(int i=0; i<height; i++){
			
			for(int j=0; j<=2*n*length; j++){
				
				if((j%(n*2)==n-i) || (j%(n*2)==n+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
    }
}