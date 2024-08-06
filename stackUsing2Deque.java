package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
	
	private Queue<Integer> pushQ = new LinkedList<>();
	private Queue<Integer> popQ = new LinkedList<>();

	public void push(int x) {
		pushQ.add(x);
	}

	public int pop() {
		if (pushQ.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		while (pushQ.size() > 1) {
			popQ.add(pushQ.remove());
		}

		int top = pushQ.remove();
		Queue<Integer> temp = pushQ;
		pushQ = popQ;
		popQ = temp;

		return top;
	}

	public int peek() {
		if (pushQ.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		while (pushQ.size() > 1) {
			popQ.add(pushQ.remove());
		}

		int top = pushQ.peek();
		popQ.add(pushQ.remove());
		Queue<Integer> temp = pushQ;
		pushQ = popQ;
		popQ = temp;

		return top;
	}

	public boolean isEmpty() {
		return pushQ.isEmpty();
	}

	public static void main(String[] args) {
		StackUsing2Queues_2 stack = new StackUsing2Queues_2();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());  // 3
		System.out.println(stack.peek()); // 2
		System.out.println(stack.pop());  // 2
		System.out.println(stack.isEmpty()); // false
	}
}
