class Pattern31{
	public static void main(String[] args){
		int n=4;
		int iter=2*n;
		
		for(int i=1; i<iter; i++){
			for(int j=1; j<iter;j++){
				int atEveryIndex = n - Math.min(Math.min(i,j),Math.min(iter-i,iter-j)) + 1;
				System.out.print(atEveryIndex+" ");
			}
			System.out.println();
		}
	}
}