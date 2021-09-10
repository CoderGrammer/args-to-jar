package com.example.argstojar;

public class Utils {

    public static void printH(String s) {
        System.out.println("\n" + s);
        System.out.println("-".repeat(s.length()));
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static String filter(Object o) {
        return o.toString();
//        String s = o.toString();
//        if (s == null || s.length() == 0) {
//            return "";
//        }
//
//        if (s.contains("CODERGRAMMER")) {
//            return s;
//        }
//        return "**";
    }

}
