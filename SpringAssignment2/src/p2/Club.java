package p2;

public class Club {

	int cId;
	String name;
	String owner;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Club [cId=" + cId + ", name=" + name + ", owner=" + owner + "]";
	}
	public Club(int cId, String name, String owner) {
		super();
		this.cId = cId;
		this.name = name;
		this.owner = owner;
	}
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
