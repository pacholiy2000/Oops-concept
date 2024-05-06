package hashmapprogram1;

import java.util.HashMap;
public class A2
{
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Vrindavan");
		map.put(2,"Chennai");
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(6,"Itarsi");
		map1.put(3,"Hoshangabad");
		map.putAll(map1);
		map.remove(6);
		map.remove(2,"Chennai");
		System.out.println(map);
	}
}