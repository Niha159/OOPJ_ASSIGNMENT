package pkg1;
class CollegeFees{
	String branch;
	int keaFees;
	public CollegeFees(String b1,int f1) {
		this.branch=b1;
		this.keaFees=f1;
	}
	public void display() {
		String message="Please pay "+keaFees+" in department "+branch;
		System.out.println(message);
	}
}
public class TestCollegeFees {

	public static void main(String[] args) {
		System.out.println("CollegeFees");
		CollegeFees smvitm1=new CollegeFees("CS",200000);
		smvitm1.display();

	}

}
