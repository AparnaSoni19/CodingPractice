package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //pushing element to stack
        for( int i =0;i<5;i++)
        {
            stack.push(i);
        }
        System.out.println(stack);
        ////removing element from stack

        for( int i =0;i<2;i++)
        {
            stack.pop();
        }
        System.out.println(stack);

        //searching top element in stack
        System.out.println(stack.peek());

        //searching  element in stack will return the position
        System.out.println(stack.search(1));
    }
}
