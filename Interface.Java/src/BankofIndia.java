
interface RBI{
	void Loan();
}
class hdfc implements RBI{
	public void Loan() {
		System.out.println("Loan verfied by Hdfc");
	}
}
public class BankofIndia implements RBI{
public void Loan(){
	System.out.println("Loan Verified by Boi");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankofIndia user1=new BankofIndia();
user1.Loan();
hdfc user2=new hdfc();
user2.Loan();
	}

}