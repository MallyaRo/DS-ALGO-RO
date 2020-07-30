package maps;

import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
     Pen p1=new Pen(10,"blue");
     Pen p2=new Pen(10,"blue");
     
     
     System.out.println(p1);
     System.out.println(p2);
     
     System.out.println((p1==p2));//returns false as both are two new objects
     //before overriding
     System.out.println((p1.equals(p2)));//this equals comes from parent object class as pen class doesnt have equals
    // as we are using the default implementation,as both addresses arent the same false returned
     
    
     //now we check after we have overriden
     System.out.println((p1.equals(p2)));
     
     
     Set<Pen> pens=new HashSet<>();
     pens.add(p1);
     pens.add(p2);
     
     System.out.println(pens);//treated as two diff pens
     //now after hashcode
     System.out.println(pens);//treated as same object
     System.out.println(p1==p2);
	}

}

class Pen{
	
	int price;
	String color;
	public Pen(int price ,String color) {
		this.price=price;
		this .color=color;
	}
	//generated from source which handles edge case also
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//comparing class
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {//may throw null pointer exception
		Pen that =(Pen) obj;
		boolean isequal = this.price==that.price&&this.color.equals(that.color);
		return isequal;
				}
	
	@Override
	public int hashCode() {
		return price +color.hashCode();
	}*/
	
}
