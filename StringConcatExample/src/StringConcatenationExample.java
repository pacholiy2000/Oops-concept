
public class StringConcatenationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str3 = "Java";
        String str4 = "Programming";
        String result2 = str3.concat(" ").concat(str4);
        System.out.println("Result 2: " + result2);

        String str1 = "Hello";
        String str2 = "World";
        String result1 = str1 + " " + str2;
        System.out.println("Result 1: " + result1);
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I")
                .append(" love")
                .append(" Java")
                .append(" programming!");
        String result3 = stringBuilder.toString();
        System.out.println("Result 3: " + result3);
	}

}
