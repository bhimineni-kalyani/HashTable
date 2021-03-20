package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;

public class Hashtest3 {

    @Test
    public void find_frequency_of_given_words() {
        String sentence = "To be or not to be";
        Hash3<String,Integer> hash3 = new Hash3<>();
        String[] words = sentence.toLowerCase().split(" ") ;
        for(String word : words) {
            Integer value = hash3.get(word);
            if(value == null) {
                value = 1;
            }
            else {
                value = value+1;
            }
            hash3.add(word,value);
        }
        int frequency = hash3.get("or");
        System.out.println(hash3);
        Assertions.assertEquals(2,frequency);
    }

    @Test
    public void find_frequency_of_given_paragraph() {
        String para = " Paranoids are not paranoid " + " because they are paranoid but " +
                      " because they keep putting themselves " + " deliberately into paranoid avoidable situations ";

        Hash3<String,Integer> hash3 = new Hash3<>();
        String[] words = para.toLowerCase().split(" ") ;
        for(String word : words){
            Integer value = hash3.get(word);
            if(value == null){
                value = 1;
            }
            else {
                value = value+1;
            }
            hash3.add(word,value);
        }
        int frequency = hash3.get("not");
        System.out.println(hash3);
        Assertions.assertEquals(2,frequency);
    }

    @Test
    public void delete_Word_From_Paragraph() {
        String para = " Paranoids are not paranoid " + " because they are paranoid but " +
                      " because they keep putting themselves " + " deliberately into paranoid avoidable situations ";

        LinkedHashMap<String,Integer> hash3 = new LinkedHashMap<>();

        String[] words=para.toLowerCase().split(" ") ;

        for(String word : words) {
            Integer value = hash3.get(word);
            if(value == null) {
                value = 1;
            }
            else {
                value = value+1;
            }
        }
        System.out.println(hash3);
        hash3.remove("situations");
        System.out.println(false);
        Assertions.assertEquals(null,hash3.get("situations"));
    }
}