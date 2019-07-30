package com.ridezum;

public class Main1 {
    public static void main(String[] args) {

        String a = "GOODMORNING";

        revers(a);



    }
    public static void revers(String anyWord) {

        char[] arrayChar = anyWord.toCharArray();

        char temp;

        for(int i = 0; i < arrayChar.length/2; i++) {

            temp = arrayChar[i];

            arrayChar[i] = arrayChar[arrayChar.length-1-i];

            arrayChar[arrayChar.length-1-i] = temp;
        }


        String result = new String(arrayChar);

        System.out.println(result);



    }

}
