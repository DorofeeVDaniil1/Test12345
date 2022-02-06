package com.company;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.reverseWords("double      spaces"));
    }

    public static String reverseWords(final String original){

        String[] array = original.split(" ");

        if (array.length==0){
            return original;
        }

        int index=0;
        for (String word: array){
            array[index]= new StringBuilder(word).reverse().toString();
            index++;
        }
        return String.join(" ",array);

    }


    }

