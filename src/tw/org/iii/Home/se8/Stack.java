package tw.org.iii.Home.se8;

import java.util.ArrayDeque;
import java.util.Deque;
import static java.lang.System.out;

public class Stack {
	private Deque elems = new ArrayDeque();
	private int capacity;

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push("Panda");
		stack.push("Monica");
		stack.push("Justin");
		out.println(stack.pop());
		out.println(stack.pop());
		out.println(stack.pop());

	}

	
	
	public Stack (int capacity){
		this.capacity = capacity;
	}
	
	public boolean push(Object elem){
		if(isFull()){
			return false;
		}
		return elems.offerLast(elem);
	}

	private boolean isFull() {
		return elems.size() + 1 > capacity;
	}
	
	public Object pop(){
		return elems.pollLast();
	}
	
	public Object peak(){
		return elems.peekLast();
	}
	
	public int size(){
		return elems.size();
	}
	

}
