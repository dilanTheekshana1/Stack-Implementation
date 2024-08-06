package Stack;

public class StackArrays {
	
	private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArrays(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
    	return top == -1;
    }

    public boolean isFull() {
    	return top == capacity - 1;
    }
    
    public void push(int value) {
    	if (isFull()) {
    		System.out.println("Stack is full.");
    		System.exit(1);
    	}
    	stack[++top] = value;
    }
    
    public int pop() {
    	if (isEmpty()) {
    		System.out.println("STACK EMPTY");
    		System.exit(1);
    	}
    	return stack[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

	public static void main(String[] args) {
		StackUsingArrays stack = new StackUsingArrays(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.peek()); // 1
	}
}
