package p1;

public class MusicSystem {

	private String companyName;
	
	
	@Override
	public String toString() {
		return "MusicSystem [companyName=" + companyName + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public MusicSystem(String companyName) {
		super();
		this.companyName = companyName;
	}

	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void playMusic(){
		
	}
}
