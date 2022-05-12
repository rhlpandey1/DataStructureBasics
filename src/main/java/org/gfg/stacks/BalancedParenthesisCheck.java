package org.gfg.stacks;

import java.util.Stack;

public class BalancedParenthesisCheck {
    static boolean checkBalance(String expression){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c=='['||c=='{'||c=='('){
                stack.push(c);
                continue;
            }
            //stack can't be empty if it's an open bracket
            if(stack.isEmpty())
                return false;
            char c1;
            switch (c){
                case ']':
                    c1=stack.pop();
                    if(c1=='('||c1=='{')
                        return false;
                        break;
                case '}':
                    c1=stack.pop();
                    if(c1=='['||c1=='(')
                        return false;
                    break;
                case ')':
                    c1=stack.pop();
                    if(c1=='['||c1=='{')
                        return false;
                    break;

            }
        }


        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String expression="([{}])";
        System.out.println(checkBalance(expression));
    }
}
