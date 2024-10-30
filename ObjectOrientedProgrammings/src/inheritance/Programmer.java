package inheritance;

public class Programmer extends Person {

	private String companyName;

	public Programmer() {
		super(); // Person();

		System.out.println("Programmer() is called...");
	}

	public Programmer(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void coding() { // service

		System.out.println("Coding ....");

	}

	@Override
	public String toString() {
		return "Programmer [ name= " + super.getName() + " designation= " + super.getDesignation() + " cname= "
				+ this.companyName + " ]";
	}

	@Override
	public Person learn() {

		System.out.println("Programmer learning programming..");
		
		return null;
	}

}
