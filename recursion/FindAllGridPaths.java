package recursion;

public class FindAllGridPaths {

	public static void main(String[] args) {
		System.out.println(path(10,10));

	}
    static int path(int n,int m) {
    	if(n==1||m==1)return 1;
    	
    	
    	return path(n,m-1)+path(n-1,m);
    	
    }
}
