public class Calculator {
public int add(int a,int b) {
		return a+b;
	}
}

public double add(double a,double b) {
	return a+b;
}
public class CompiletimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc=new Calculator();
		int sum1=calc.add(5, 10);
		System.out.println("Sum of 5 and 10(integer):+sum1");
		double sum2=calc.add(2.5, 3.7);
		System.out.println("Sum of 2.5 and 3.7(doubles):+sum2");
	}


}

