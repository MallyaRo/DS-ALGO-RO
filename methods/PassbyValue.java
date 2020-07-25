package methods;

public class PassbyValue {

	public static void main(String[] args) {
		//int c=23,d=56;
		//swap(c,d);
		//System.out.println(c+" "+d);
       // dog c=new dog();
        dog d=new dog();
        //c.legs=3;
        d.legs=4;
        x(d);
        System.out.println(d.legs);
        //swap(c,d);
        //System.out.println("c="+c.legs+" d="+d.legs);
	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static void swap(dog a, dog b) {
		dog temp=a;
		a=b;
		b=temp;
	}
	static void x(dog d) {
		d.legs=9;
	}

}
class dog{
	int legs;
}
