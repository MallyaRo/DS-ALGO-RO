package Backtracking;

public class ShortestPathInAMaze {

	public static void main(String[] args) {
		int a[][]= {
				{1,1,1,1,1,0,0,1,1,1},
				{0,1,1,1,1,1,0,1,0,1},
				{0,0,1,0,1,1,1,0,0,1},
				{1,0,1,1,1,0,1,1,0,1},
				{0,0,0,1,0,0,0,1,0,1},
				{1,0,1,1,1,0,0,1,1,0},
				{0,0,0,0,1,0,0,1,0,1},
				{0,1,1,1,1,1,1,1,0,0},
				{1,1,1,1,1,0,0,1,1,1},
				{0,0,1,0,0,1,1,0,0,1},
		};
		int k=minpath(a,0,0,9,9);
		if(k>=10000000) {
			System.out.println("No path Possible  since its not reachable ");
			return;
		}
		System.out.println(k);

	}
	//i,j are starting points,x,y and end points
   static int minpath(int a[][],int i,int j,int x,int y) {
	   int rows=a.length;
	   int col=a[0].length;
	   boolean visited[][]=new boolean[rows][col];
	   //to consider a boolean also, therefore method overloading
	   return minpath(a, i, j, x, y, visited);
	   
   }
   static boolean isSafe(int a[][],int i,int j,boolean visited[][]) {
	   int rows=a.length;
	   int col=a[0].length;
	   return (i>=0&&j>=0&&i<rows&&j<col&&a[i][j]==1&&!visited[i][j]); 
	   
   }
    static int minpath(int a[][],int i,int j,int x,int y,boolean visited[][]) {
    	if(!isSafe(a,i,j,visited)) {
    		return 10000000;//not possible hence a big no is returned so that its not considered
    	}
	   if(i==x&&j==y) return 0;
	   visited[i][j]=true;
	   //now we will travel in each direction
	   //we add one to each to count the steps
	   int left=minpath(a, i, j-1, x, y, visited)+1;
	   int right=minpath(a, i, j+1, x, y, visited)+1;
	   int up=minpath(a, i-1, j, x, y, visited)+1;
	   int down=minpath(a, i+1, j, x, y, visited)+1;
	 //now while returning from any path, we have to mark it false as well to make it safe for other paths
	   //this is the line which  makes backtracking work
	   visited[i][j]=false;
	   
	   return Math.min(Math.min(left,right),Math.min(up, down));

	   
	   
   }
}
