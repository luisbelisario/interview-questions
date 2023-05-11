import java.util.Arrays;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = new String[] {"luis", "belisario", "santos"};

        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        Integer idx = 0;

        while (idx < s1.length() && idx < s2.length()) {
            if(s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }

        }
        if(idx != 0) {
            System.out.println(s1.substring(0, idx));
        } else {
            System.out.println(" ");
        }

    }
}
