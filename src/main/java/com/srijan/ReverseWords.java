package com.srijan;

public class ReverseWords {
    public static String reverseWords(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i>= 0 ; i--){
            reversed.append(words[i]);
            reversed.append(' ');
        }
        return reversed.toString().trim();

    }
    public static void main(String[] args) {
        String original = "The man is god";
        String reversed = reverseWords(original);
        System.out.println("R statement : "+ reversed);

    }
}
