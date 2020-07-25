package oops.Singleton;

public class MainClass {

	public static void main(String[] args) {
		//no multiple objects allowed AppConfig obj=new AppConfig();
		AppConfig obj=AppConfig.getInstance();//static fxn
		AppConfig obj1=AppConfig.getInstance();
		AppConfig obj2=AppConfig.getInstance();
		//obj,obj1,obj2 all are same objects because only one object is made
	}

}
