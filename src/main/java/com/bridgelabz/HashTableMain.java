/*
Remove avoidable word from the paragraph phase
 */
package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hashtable Program");
        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        /*
         Storing given sentence in an array.
         Converting the sentence to lower case and removing spaces.
        */
        String[] sentenceArray = sentence.toLowerCase().split(" ");

        // Iterating over the array
        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            if( value == null)
                value = 1;
            else
                value = value + 1;
            hashTable.add(word , value);
        }
        System.out.println(hashTable);
        hashTable.remove("avoidable");//remove avoidable word from the paragraph
        System.out.println(hashTable);
    }
}