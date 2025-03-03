package DataStructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class palindromicNumbers {

    static ArrayList<String> palindromes = new ArrayList<>();

    public static void main(String[] args) {

        String S = "54321";
        String [] stringArray = S.split("");

        palindromes.addAll(Arrays.asList(stringArray));

        String possiblePalindrome = stringArray[0];
        int current = 0;
        while(current < stringArray.length) {
            for(int i = 1; i < stringArray.length; i++) {
                if(i == 1) {
                    possiblePalindrome = stringArray[current] + stringArray[i];
                    checkPalindrome(possiblePalindrome);
                } else {
                    possiblePalindrome += stringArray[i];
                    checkPalindrome(possiblePalindrome);
                }
            }
            current += 1;

            System.out.println(possiblePalindrome);
        }

        Integer bigger = 0;
        for(String str : palindromes) {
            System.out.println(str);
            Integer number = Integer.valueOf(str);
            if(number > bigger) {
                bigger = number;
            }
        }

        System.out.println(bigger);
    }

    private static void checkPalindrome(String possiblePalindrome) {
        StringBuilder aux = new StringBuilder(possiblePalindrome);
        String reversed = new String (aux.reverse());
        if(possiblePalindrome.equals(reversed) && !possiblePalindrome.contains("0")) {
            palindromes.add(possiblePalindrome);
        }
    }
}
