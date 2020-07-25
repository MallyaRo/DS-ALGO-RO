package oops.Singleton;

public class AppConfig {
	
	private AppConfig() {
		
	}
	
   private static AppConfig obj =null;//making static object and if we dont want to use it then why to initialize it therefore make it null
   
	public static AppConfig getInstance() {
		//return only one instance of this class
		if(obj==null) {
			obj=new AppConfig();//will be called only once 
		}
		return obj;
	}
	
	
	
}
