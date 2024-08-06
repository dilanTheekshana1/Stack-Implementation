package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {
    
   

    public static void main(String[] args) {
       
        Deque<Integer> stack = new ArrayDeque<>();

       
        stack.push(1);  // Stack: [1]
        stack.push(2);  // Stack: [2, 1]
        stack.push(3);  // Stack: [3, 2, 1]

       
        System.out.println(stack.pop()); // Output: 3, Stack: [2, 1]
        System.out.println(stack.pop()); // Output: 2, Stack: [1]

        
        System.out.println(stack.peek()); // Output: 1, Stack: [1]

       
        System.out.println(stack.isEmpty()); // Output: false, Stack: [1]

        
        stack.clear(); // Stack: []

        
        System.out.println(stack.isEmpty()); // Output: true, Stack: []
    }
}
