
abstract class example{
	abstract void executed();
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     example ex=new example() {
     void executed() {System.out.println("Java 8 Example");}
	};
     
	ex.executed();
}
}