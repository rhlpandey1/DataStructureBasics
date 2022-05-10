package org.gfg.stacks;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(9);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.remove(2);
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
