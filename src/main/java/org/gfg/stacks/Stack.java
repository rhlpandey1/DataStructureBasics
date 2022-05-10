package org.gfg.stacks;

public class Stack {
    static final int MAX=1000;
    int top;
    int[] a=new int[MAX];
    Stack(){
        top=-1;
    }

    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+" pushed into the stack");
            return true;
        }

    }
    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }

    }
    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ a[i]);
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println(s.top);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println("Top element "+s.peek());
        System.out.println("Elements present :");
        s.print();
    }
}
