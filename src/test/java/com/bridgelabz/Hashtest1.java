package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hashtest1 {
    private Object Hash1;

    @Test
    public void find_frequency_of_given_words() {
        String sentence = "To be or not to be";
        Hash1<String,Integer> Hash1 = new Hash1<>();

        String[] words=sentence.toLowerCase().split(" ") ;

        for(String word : words) {
            Integer value = Hash1.get(word);
            if(value == null) {
                value = 1;
            }
            else {
                value = value+1;
            }
            Hash1.add(word,value);
        }
        int frequency = Hash1.get("be");
        System.out.println(Hash1);
        Assertions.assertEquals(2,frequency);
    }
}