package com.srijan;

public class ReverseWordII {
    static String reverseWords(String s){
        String words[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(' ');
        }
        return sb.toString().trim();


    }

    public static void main(String[] args) {
        String s = "The Sky is Blue";
        System.out.println(reverseWords(s));

    }
}
