package arrays;

public class ArrayIntroduction {

	public static void main(String[] args) {
	//	int [] marks= new int [5];// reserves memory for us// length of array in from 0 to n-1 
	 //   int rollNos[] ,classes[];
	//	int []age = {1, 9,2,3,4,5,5};
		double[]marks = {96.6,96.6,96.6, 96.0,96.0};
		marks[3]=97.0;
		for(int i = 0;i< marks.length;i++) {
			System.out.println(marks[i]);
		}
	}

}
