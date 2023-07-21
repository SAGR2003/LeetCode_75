package Greatest_Common_Divisor_Of_Strings;

public class greatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        new greatestCommonDivisorOfStrings();
    }

    public greatestCommonDivisorOfStrings() {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "AB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }

    public String gcdOfStrings(String str1, String str2) {
        int endIndex = gcd(str1.length(), str2.length());
        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, endIndex);
        }
        return "";
    }

    private int gcd(int firstNum, int secondNum) {
        return secondNum == 0 ? firstNum : gcd(secondNum, firstNum % secondNum);
    }
}