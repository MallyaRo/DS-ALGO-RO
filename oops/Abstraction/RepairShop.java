package oops.Abstraction;

public class RepairShop {
	
	/* public static void repaircar(Wagonr car) {
		 System.out.println("car is repaired");
	 }
	 public static void repaircar(Audi car) {
		 System.out.println("car is repaired");
	 }*/
	public static void repaircar(Car car) {
		 System.out.println("car is repaired");
	 }
	
     public static void main(String[]args) {
    	 Wagonr wagonr=new Wagonr();
    	 Audi audi=new Audi();
    	// car object cant be made, Car car =new Car();
    	 repaircar(wagonr);
    	 repaircar(audi);
    	 //wagonr.acc();
    	 //audi.brake();
    	 wagonr.honk();
     }
     
     
     
}
