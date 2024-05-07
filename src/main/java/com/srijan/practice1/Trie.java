package com.srijan.practice1;

public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();// root is empty
    }
    private class TrieNode{

        private TrieNode[] childern;
        private boolean isWord;

        public TrieNode(){
            this.childern = new TrieNode[26];
            this.isWord = false;
        }
    }
    public void insert(String word){
        if(word == null || word.isEmpty()){
            throw new IllegalArgumentException("Invalid input ");
        }
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i = 0; i< word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(current.childern[index] == null){
                TrieNode node = new TrieNode();
                current.childern[index] = node;
                current = node;
            }else {
                current = current.childern[index];
            }
        }
        current.isWord = true;

    }
    public boolean search(String word){
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.childern[index] == null){
                return false;
            }
            current = current.childern[index];
        }
        return current.isWord;
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("cab");
        trie.insert("son");
        trie.insert("so");
        System.out.println("Values inserted successfuly !!");

        System.out.println(trie.search("cat"));
        System.out.println(trie.search("cab"));
        System.out.println(trie.search("so"));
        System.out.println(trie.search("ca"));

    }
}
