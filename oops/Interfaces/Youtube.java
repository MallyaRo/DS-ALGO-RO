package oops.Interfaces;

public abstract interface Youtube extends Editor {

	abstract void makeVideo();
	default public void upload() {
		System.out.println("video uploaded");
	}
	//default implementation for concrete method
	//to support such a new feature this person wont hav to make upload()
	//prone to diamond problem
	// then person may not know which one to implement ,if this fxn is also in student, then implementation,definition is necessary 
}
