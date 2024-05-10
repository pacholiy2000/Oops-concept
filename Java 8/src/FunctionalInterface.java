
interface Sample {
    String run();
    default void hello() {
    	System.out.println("Default method call");
    }
}

public class FunctionalInterface implements Sample {
	  @Override
	    public String run() {
	        return "Sample interface run";
	    }
    public static void main(String[] args) {
        FunctionalInterface f =new FunctionalInterface();
        System.out.println(f.run());
        f.hello();
    }

  
}