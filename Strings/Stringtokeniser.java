package Strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Stringtokeniser {
    public static void main(String[] args) {
        String x = "Hello, My name is Jeet Mondal, Hometown Kolkata";
//
//        StringTokenizer st = new StringTokenizer(x, "o");
//
//        while (st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }

        String[] arr = x.split(" ");

        for (String e : arr){
            System.out.println(e);
        }


    }
}
