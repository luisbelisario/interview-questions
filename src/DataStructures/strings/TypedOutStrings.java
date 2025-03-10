package DataStructures.strings;

import java.util.ArrayList;
import java.util.List;

public class TypedOutStrings {

    public static void main(String[] args) {

        Boolean isTypedOut = isTypedOut("ac#z", "az#b");

        System.out.println(isTypedOut);
    }

    private static Boolean isTypedOut(String str1, String str2) {

        List<String> myStringList1 = List.of(str1.split(""));
        List<String> myStringList2 = List.of(str2.split(""));

        List<String> myTypedOut1 = new ArrayList<>();
        List<String> myTypedOut2 = new ArrayList<>();

        getTypedOutList(myStringList1, myTypedOut1);
        getTypedOutList(myStringList2, myTypedOut2);

        String myTypedOutString1 = String.join("", myTypedOut1);
        String myTypedOutString2 = String.join("", myTypedOut2);

        return myTypedOutString1.equals(myTypedOutString2);

    }

    private static void getTypedOutList(List<String> myStringList, List<String> myTypedOut) {
        for (String s : myStringList) {
            if (!myTypedOut.isEmpty() && "#".equals(s)) {
                myTypedOut.remove(myTypedOut.size() - 1);
            } else {
                myTypedOut.add(s);
            }
        }
    }
}
