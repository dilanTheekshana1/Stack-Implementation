package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues{
	
	private Queue<Integer> pushQ = new LinkedList<>();
	private Queue<Integer> popQ = new LinkedList<>();

	public void push(int x) {
		pushQ.add(x);
		while (!popQ.isEmpty()) {
			pushQ.add(popQ.remove());
		}
		Queue<Integer> temp = pushQ;
		pushQ = popQ;
		popQ = temp;
	}

	public int pop() {
		if (popQ.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return popQ.remove();
	}

	public int peek() {
		if (popQ.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return popQ.peek();
	}

	public boolean isEmpty() {
		return popQ.isEmpty();
	}

	public static void main(String[] args) {
		StackUsing2Queues stack = new StackUsing2Queues();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());  // 3
		System.out.println(stack.peek()); // 2
		System.out.println(stack.pop());  // 2
		System.out.println(stack.isEmpty()); // false
	}
}
