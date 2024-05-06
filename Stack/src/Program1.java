
import java.util.Stack;
class A{
public static void main(String args[]){
Stack<Integer> stack=new Stack<>();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(6);
System.out.println("Before using pop()"+stack);
stack.pop();
System.out.println("After doing pop()"+stack);
}
}