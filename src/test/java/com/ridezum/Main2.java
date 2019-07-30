package com.ridezum;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("HI");
        array.add("Bye");
        array.add("Hi");
        array.add("Ok");
        array.add("No");

//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }//        OR

        for (String element: array) {
            System.out.println(element);
        }


    }


}
