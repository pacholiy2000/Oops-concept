class Parentdemo{
	void car() {
		System.out.println("BMW");
	}
}
class C1 extends Parentdemo{
	void cycle() {
		System.out.println("Atlas");
	}
}
class C2 extends Parentdemo{
	void bike() {
		System.out.println("Hero");
	}
}
public class hirerarchial {
	public static void main(String[] args) {
		C1 c=new C1();
		c.car();
		c.cycle();
		C2 cz=new C2();
		cz.car();	}

}
