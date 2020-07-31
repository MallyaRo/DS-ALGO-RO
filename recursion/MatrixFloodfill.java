package recursion;

public class MatrixFloodfill {

	public static void main(String[] args) {
		int a[][]= {
				{1,1,1,2,1,1,1},
				{2,2,1,2,2,1,1},
				{0,2,2,2,1,1,1},
				{1,1,0,2,2,2,2},
				{1,1,2,2,1,0,0}
		        };
		floodfill(a,2,3,6,2);
		for(int i=0;i<5;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
	static void floodfill(int a[][],int r,int c,int toFill,int prevfill) {
		int rows=a.length;
		int col=a[0].length;
		//r,c are the positions of the current element given to be painted
		if(r<0||r>=rows||c<0||c>=col) {
			return;
		}
		if(a[r][c]!=prevfill) {
			return;
		}
		//the above two ensure that we are inside the matrix
		a[r][c]=toFill;
		floodfill(a,r-1,c,toFill,prevfill);
		floodfill(a,r,c-1,toFill,prevfill);
		floodfill(a,r,c+1,toFill,prevfill);
		floodfill(a,r+1,c,toFill,prevfill);
		
	}

}
