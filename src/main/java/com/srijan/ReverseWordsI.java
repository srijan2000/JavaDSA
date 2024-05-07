package com.srijan;

public class ReverseWordsI {
    static String reverse(String s){
        String [] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i>=0; i--){
            sb.append(words[i]);
            sb.append(' ');
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String reverse = reverse(s);
        System.out.println("Reverse String : "+ reverse);
    }
}
