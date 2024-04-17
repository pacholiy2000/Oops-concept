class Grandfather{
	void scooter() {
		System.out.println("Hero");
	}
}
class Father extends Grandfather{
	void car() {
		System.out.println("BMW");
	}
}
class Son extends Father{
	void cycle() {
		System.out.println("Atlas");
	}
}
public class MultiInheritance {
public static void main(String args[]) {
	Son s=new Son();
	s.scooter();
	s.car();
	s.cycle();
}


}
