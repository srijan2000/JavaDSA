package com.srijan;
// Representation of a HashNode in HashTable
/*
A HashNode class in HashTable consists of three data members.
    K key - It is a unique value which helps in storing data
    here, K signifies generic type
    V value - It is the data that is stored based on location computed by key.
    Here, V signifies generic type
    HashNode next - It refers to next HashNode in chain of hash nodes,
*/

 public class HashTable{
     private HashNode[] buckets;
     private int numOfBuckets;
     private int size;
     private HashTable(int capacity){
         this.numOfBuckets = capacity;
         this.buckets = new HashNode[numOfBuckets];
         this.size = 0;
     }
     private  HashTable(){
         this(10);
     }
     private class HashNode{
          private Integer key;
          private String value;
          private HashNode next;

          public HashNode(Integer key, String value){
              this.key = key;
              this.value = value;
          }

     }
     public int size(){
         return size;
     }
     public boolean isEmpty(){
         return size == 0;
     }
     public void put(Integer key, String value){
         if(key == null || value == null){
             throw new IllegalArgumentException("Key or value is null ");
         }
         int bucketIndex = getBucketIndex(key);
         HashNode head = buckets[bucketIndex];
         while(head != null){
             if(head.key.equals(key)){
                 head.value = value;
                 return;
             }
             head = head.next;
         }
         size++;
         head = buckets[bucketIndex];
         HashNode node = new HashNode(key, value);
         node.next = head;
         buckets[bucketIndex] = node;

     }
     public String get(Integer key){
         if(key == null){
             throw new IllegalArgumentException("Key is null !!");
         }
         int bucketIndex = getBucketIndex(key);
         HashNode head = buckets[bucketIndex];
         while(head != null){
             if(head.key.equals(key)){
                 return head.value;
             }
             head = head.next;
         }
         return null;
     }
     public String remove(Integer key){
         int bucketIndex = getBucketIndex(key);
         HashNode head = buckets[bucketIndex];
         HashNode previous = null;
         while (head != null){
             if(head.key.equals(key)){
                 break;
             }
             previous = head;
             head = head.next;

         }if(head == null){
             return null;
         }
         size--;
         if(previous != null){
             previous.next = head.next;
         }else {
             buckets[bucketIndex] = head.next;
         }
         return head.value;
     }
     private int getBucketIndex(Integer key){
         return key % numOfBuckets;
     }

     public static void main(String[] args) {
         HashTable table = new HashTable(10);
         table.put(105, "Tom");
         table.put(21,"Sana");
         table.put(31,"Harry");
         table.put(11,"Potter");

         System.out.println(table.size());
         System.out.println(table.get(11));
         System.out.println(table.remove(21));
     }

 }