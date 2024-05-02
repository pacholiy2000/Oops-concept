
public class capacitybuilderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		s.append("Company");
		System.out.println(s.capacity());
		s.append("RailWorld is Private Company.");
		System.out.println(s.capacity());
	}

}
