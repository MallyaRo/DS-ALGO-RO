package ComparatorsAndComparables;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		List<Student> s=new ArrayList<>();

		s.add(new Student(39,"rohan"));
		s.add(new Student(35,"ron"));
		s.add(new Student(31,"tyler"));
		s.add(new Student(30,"tom"));
		s.add(new Student(34,"tim"));
		s.add(new Student(31,"pol"));
		s.add(new Student(32,"jim"));
		s.add(new Student(30,"kim"));
		s.add(new Student(33,"kim"));
		s.add(new Student (39,"adam"));
		s.forEach(System.out::println);
	    Collections.sort(s);
	    System.out.println("in Ascending order:");
	    s.forEach(System.out::println);
		System.out.println("after implementing comparator");
		Collections.sort(s,new SortByNamethenMarks());
		//or we can make a anonymous class also
		/*
		 * 
		 * Collections.sort(s,new Comparator<Student>()){
		 *  
		 *  @Override
		 *  public int compare(Student o1,Student o2){
		 *  if(o1.name.contentEquals(o2.name)) {
			return o1.marks-o2.marks;  //to get positive or negative
		}
		
		else return o1.name.compareTo(o2.name);
		 *  }
		 * 
		 * }
		 * 
		 * 
		 * */
		s.forEach(System.out::println);
		System.out.println("making anonymous class");
		Collections.sort(s,new Comparator<Student>(){  
			
		       @Override
			   public int compare(Student o1,Student o2){
			  if(o1.name.contentEquals(o2.name)) {
				return o1.marks-o2.marks;  //to get positive or negative
			}
			
			else return o1.name.compareTo(o2.name);
			   }
		});
		s.forEach(System.out::println);
		System.out.println("using lambda in dec order of names");
		Collections.sort(s,  ( o1, o2)->{
			  if(o1.name.contentEquals(o2.name)) {
				return o2.marks-o1.marks;  //to get positive or negative
			}
			
			else return o2.name.compareTo(o1.name);
			   }
		);
		s.forEach(System.out::println);
		
		System.out.println("sorting only by name");
		Collections.sort(s,  ( o1, o2)->o1.name.compareTo(o2.name));
		s.forEach(System.out::println);
		// we can also write:
		System.out.println("sorting  by name then marks , we can reverse also");
		////vvvimp
		Collections.sort(s,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		s.forEach(System.out::println);
		
		
	}
}
 class SortByNamethenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.contentEquals(o2.name)) {
			return o1.marks-o2.marks;  //to get positive or negative
		}
		
		else return o1.name.compareTo(o2.name);
	}
	
}
		
