package Reverse_Words_in_a_String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        new ReverseWordsInAString();
    }

    public ReverseWordsInAString() {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        StringBuilder finalSentence = new StringBuilder();
        String[] allWords = s.split(" +");

        for (int i = allWords.length - 1; i >= 0; i--) {
            finalSentence.append(allWords[i]).append(" ");
        }

        return finalSentence.toString().trim();
    }
}
