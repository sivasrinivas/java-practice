package code;


public class FloodFill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a= new int[5][5];
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a.length; j++){
				a[i][j] = 0;
			}
		
		floodfill(a, 2,3);
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
		
	}
	
	public static void floodfill(int[][] a, int x, int y){
		if(x>=a.length || y>=a.length || x<0 || y<0)
			return;
		if(a[x][y]==1){
			return;
		}
		a[x][y]=1;
		floodfill(a, x-1, y);
		floodfill(a, x, y-1);
		floodfill(a, x+1, y);
		floodfill(a, x, y+1);
	}

}
