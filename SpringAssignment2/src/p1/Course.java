package p1;

public class Course {

	int cid;
	String name;
	float fee;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(int cid, String name, float fee) {
		super();
		this.cid = cid;
		this.name = name;
		this.fee = fee;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getFee() {
		return fee;
	}


	public void setFee(float fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", fee=" + fee + "]";
	}
	
}
