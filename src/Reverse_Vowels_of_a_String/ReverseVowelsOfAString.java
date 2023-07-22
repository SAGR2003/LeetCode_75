package Reverse_Vowels_of_a_String;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        new ReverseVowelsOfAString();
    }

    public ReverseVowelsOfAString() {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        StringBuilder reverseVowels = getReverseVowels(s);
        StringBuilder finalWord = new StringBuilder();
        int vowel = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                finalWord.append(reverseVowels.charAt(vowel));
                vowel++;
            } else {
                finalWord.append(s.charAt(i));
            }
        }

        return finalWord.toString();
    }

    private StringBuilder getReverseVowels(String s) {
        StringBuilder reverseVowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                reverseVowels.append(s.charAt(i));
            }
        }
        return reverseVowels.reverse();
    }

    private boolean isVowel(char letter) {
        return switch (letter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}
