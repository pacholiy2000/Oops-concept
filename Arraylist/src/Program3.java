
import java.util.ArrayList;
import java.util.Collections;
class A{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<>();
		list.add("USA");
		list.add("UK");
		list.add("CHINA");
		list.add("IRAN");
		list.add("INDIA");
		System.out.println("Orginal list : "+list);
		Collections.shuffle(list);
		System.out.println("Result after shuffle : "+list);
		Collections.shuffle(list);
		System.out.println("Result after shuffle 2 : "+list);
	}
}