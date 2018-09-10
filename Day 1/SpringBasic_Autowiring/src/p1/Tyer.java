package p1;

public class Tyer {

	private String companyName;
	private int size;
	public Tyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tyer(String companyName, int size) {
		super();
		this.companyName = companyName;
		this.size = size;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Tyer [companyName=" + companyName + ", size=" + size + "]";
	}
	
	
	
}
