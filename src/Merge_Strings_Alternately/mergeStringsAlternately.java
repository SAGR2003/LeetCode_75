package Merge_Strings_Alternately;

public class mergeStringsAlternately {
    public static void main(String[] args) {
        new mergeStringsAlternately();
    }

    public mergeStringsAlternately() {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder response = new StringBuilder();
        int counter = 1;

        while (counter < (length1 + length2)) {
            if (counter <= length1){
                response.append(word1.charAt(counter - 1));
            }

            if (counter <= length2){
                response.append(word2.charAt(counter - 1));
            }
            counter++;
        }
        return response.toString();
    }
}

