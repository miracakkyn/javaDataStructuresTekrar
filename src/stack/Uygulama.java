package stack;

public class Uygulama {
	public static void main(String[] args) {
		stackList stack=new stackList(6);
		stack.push(6);		
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.printYigin();
		stack.push(10);
		stack.push(11);
		stack.push(9);
		stack.printYigin();
stack.pop();stack.printYigin();stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();

	}
	
}
