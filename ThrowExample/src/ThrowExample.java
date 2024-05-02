class HowAreYou extends RuntimeException{
	public HowAreYou(String str) {
		super(str);
	}
}
public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int amount = 100;
if(amount >= 1000) {
	System.out.println("Hey go!");
}
else {
	throw new HowAreYou("Or yoy stay!");
}
	}

}
