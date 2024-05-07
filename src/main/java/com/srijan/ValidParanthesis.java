package com.srijan;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean validParanthesis(String s){
        Stack<Character> stack = new Stack<>();



        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }else {
                char top = stack.peek();

               if(c == '}' && top == '{' ||
                       c == ']' && top == '[' ||
                       c == ')' && top == '('){
                   stack.pop();
               }else {
                   return false;
               }

            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String s = "{[()}";
        System.out.println(validParanthesis(s));
    }
}
