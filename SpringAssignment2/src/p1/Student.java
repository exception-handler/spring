package p1;


import java.util.Set;

public class Student {

	int sId;
	String name;
	Set<Course> course;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sId, String name, Set<Course> course) {
		super();
		this.sId = sId;
		this.name = name;
		this.course = course;
	}


	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Course> getCourse() {
		return course;
	}


	public void setCourse(Set<Course> course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", course=" + course + "]";
	}


	public void printInfo() {
		
		System.out.println("Student name is: "+name);
		System.out.println("Student Id is: "+sId);
		for (Course course2 : course) {
			System.out.println(course2);
		}

	}
	
}
