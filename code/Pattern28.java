class Pattern28{
	public static void main(String[] args){
		int n = 5;
		
		for(int i=0; i<2*n; i++){
			int totalColsInRow = i<n ? i : 2*n - i;
			int spaces = n - totalColsInRow;
			for(int j=0; j<spaces; j++ ){
				System.out.print(" ");
			}
			
			for(int j=0; j<totalColsInRow; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}