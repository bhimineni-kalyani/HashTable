package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hashtest2 {

    @Test
    public void find_frequency_of_given_words() {

        String sentence = " To be or not to be ";

        Hash2 hash2 = new Hash2();

        String[] words=sentence.toLowerCase().split(" ") ;

        for(String word : words){
            Integer value = (Integer) hash2.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
            hash2.add(word,value);
        }
        int frequency = (int) hash2.get("be");
        System.out.println(hash2);
        Assertions.assertEquals(2,frequency);
    }

    @Test
    public void find_frequency_of_given_paragraph() {
        String para = " Paranoids are not paranoid " + " because they are paranoid but " +
                " because they keep putting themselves " + " deliberately into paranoid avoidable situations ";

        Hash2 hash2 = new Hash2();

        String[] words=para.toLowerCase().split(" ") ;

        for(String word : words) {
            Integer value = (Integer) hash2.get(word);
            if(value == null) {
                value=1;
            }
            else {
                value=value+1;
            }
            hash2.add(word,value);
        }
        int frequency = (int) hash2.get("to");
        System.out.println(hash2);
        Assertions.assertEquals(2,frequency);
    }
}