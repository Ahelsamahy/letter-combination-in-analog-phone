package com.company;

import java.util.ArrayList;
import java.util.HashMap;  // to use dictionary
import java.util.List;
import java.util.regex.Pattern;

import Exception.outOfScope;

public class Main {

    //using DFS here as it would be better to check all the levels one by one in Stack way (LIFO)
    public static List<String> letterCombinations(String digits) throws outOfScope {
        //region Dictionary

        //digits are the key and their equivalent of character are the value
        HashMap<Character, char[]> numWithChar = new HashMap<Character, char[]>();

        numWithChar.put('0', new char[]{});
        numWithChar.put('1', new char[]{});                 //added it so I can throw a user-friendly exception
        numWithChar.put('2', new char[]{'a', 'b', 'c'});
        numWithChar.put('3', new char[]{'d', 'e', 'f'});
        numWithChar.put('4', new char[]{'g', 'h', 'i'});
        numWithChar.put('5', new char[]{'j', 'k', 'l'});
        numWithChar.put('6', new char[]{'m', 'n', 'o'});
        numWithChar.put('7', new char[]{'p', 'q', 'r', 's'});
        numWithChar.put('8', new char[]{'t', 'u', 'v'});
        numWithChar.put('9', new char[]{'w', 'x', 'y', 'z'});
        //endregion

        List<String> result = new ArrayList<String>();


        //If it isn't numbers only, then it might at least have some numbers inside that can be used.
        if (!digits.matches("^[0-9]*$")) {
            digits = digits.replaceAll("[^\\d.]", "");
            //In case it managed to remove everything but there are numbers left
            if (digits.matches("[0-9]+")) {
                System.out.println("alphabet has been detected in the input, removing them and proceed with numbers only " + digits);
            } else {
                throw new outOfScope("please enter at least one number, do not enter any special character or alphabet");
            }
        }

        //When the user enters a digits that include 1, then it will be removed and not return empty list
        if (digits.contains("1")) {
            digits = digits.replace("1", "");
        }

        //limitation of 4 digits only
        if (0 > digits.length() || digits.length() > 4)
            throw new outOfScope("please try to enter more than 0 digit and less than 4 digits");

        char[] arr = new char[digits.length()];
        DFS(digits, 0, numWithChar, result, arr);
        return result;
    }

    private static void DFS(String digits, int index, HashMap<Character, char[]> dict, List<String> result, char[] arr) {
        if (index == digits.length()) {
            result.add(new String(arr));
            return;
        }
        char number = digits.charAt(index);
        char[] candidates = dict.get(number);
        for (int i = 0; i < candidates.length; i++) {
            arr[index] = candidates[i];
            // to keep adding the characters
            DFS(digits, index + 1, dict, result, arr);
        }
    }

    public static void main(String[] args) throws outOfScope {
        System.out.println(letterCombinations(""));
    }
}
