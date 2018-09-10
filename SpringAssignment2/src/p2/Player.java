package p2;

public class Player {

	int pId;
	String name;
	float pay;
	Club club;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(int pId, String name, float pay, Club club) {
		super();
		this.pId = pId;
		this.name = name;
		this.pay = pay;
		this.club = club;
	}


	@Override
	public String toString() {
		return "Player [pId=" + pId + ", name=" + name + ", pay=" + pay + ", club=" + club + "]";
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPay() {
		return pay;
	}


	public void setPay(float pay) {
		this.pay = pay;
	}


	public Club getClub() {
		return club;
	}


	public void setClub(Club club) {
		this.club = club;
	}


	public void printInfo() 
	{
		System.out.println("P ID is: "+pId);
		System.out.println("Name is: "+name);
		System.out.println("pay is: "+pay);
		System.out.println("Club is "+club);
	}
}
