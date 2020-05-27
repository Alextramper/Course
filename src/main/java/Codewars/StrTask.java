package Codewars;


import java.util.Arrays;


public class StrTask {

    public static void main(String[] args ) {
        String[] t = {"regex", "tuto", "ceville", "mode"};
       System.out.println(twoSort(t));

    }
     static String twoSort(String[] s) {
        Arrays.sort(s);
        String out = String.join("***", s[0].split(""));
        return out;
    }
}