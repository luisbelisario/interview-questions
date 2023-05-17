import java.util.Arrays;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = new String[] {"luis", "belisario", "santos"};

        // primeiro coloca o array em ordem alfabetica
        // isso garante que o prefixo dos elementos do meio serão iguais
        // caso eles tenham realmente prefixos em comum
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        Integer idx = 0;

        while (idx < s1.length() && idx < s2.length()) {
            if(s1.charAt(idx) == s2.charAt(idx)) {
                // para cada caractere igual entre a primeira a ultima string
                // incremento o valor de idx
                // isso significa que existe mais uma letra igual no prefixo comum
                idx++;
            } else {
                break;
            }

        }

        if(idx != 0) {
            // ao final mostro a substring correspondente ao numero de caracteres iguais
            // entre as strings
            System.out.println(s1.substring(0, idx));
        } else {
            System.out.println(" ");
        }

    }
}
