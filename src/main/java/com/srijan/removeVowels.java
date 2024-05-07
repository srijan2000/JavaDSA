package com.srijan;

import java.util.Set;

public class removeVowels {
    public static String removeVowels(String word){
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        /*for(int i = 0; i< word.length(); i++){
           char ch =  word.charAt(i);

           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               continue;
           }else {
               sb.append(ch);
           }
        }*/
        Set<Character> vowels = Set.of('a','e','i','o','u');
        char[] charArray = word.toCharArray();
        for(char ch : charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "what  is your name ?";
        System.out.println(removeVowels(str));
    }
}
