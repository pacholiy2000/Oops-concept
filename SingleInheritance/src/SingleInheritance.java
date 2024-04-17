class Parent{
	void bike() {
		System.out.println("Hero");
	}
}
class Child extends Parent{
	void Cycle() {
		System.out.println("Atlas");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child c=new Child();
        c.bike();
        c.Cycle();
	}

}
