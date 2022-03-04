package com.labs1904;


import java.util.HashMap;
import java.util.Map;

public class SecretRecipeDecoder {
    private static Map<String, String> ENCODING = new HashMap<String, String>() {
        {
            put("y", "a");
            put("h", "b");
            put("v", "c");
            put("x", "d");
            put("k", "e");
            put("p", "f");
            put("z", "g");
            put("s", "h");
            put("a", "i");
            put("b", "j");
            put("e", "k");
            put("w", "l");
            put("u", "m");
            put("q", "n");
            put("n", "o");
            put("l", "p");
            put("m", "q");
            put("f", "r");
            put("o", "s");
            put("i", "t");
            put("g", "u");
            put("j", "v");
            put("t", "w");
            put("d", "x");
            put("r", "y");
            put("c", "z");
            put("3", "0");
            put("8", "1");
            put("4", "2");
            put("0", "3");
            put("2", "4");
            put("7", "5");
            put("5", "6");
            put("9", "7");
            put("1", "8");
            put("6", "9");
        }
    };

    /**
     * Given a string named str, use the Caesar encoding above to return the decoded string.
     * @param str
     * @return
     */
    public static String decodeString(String str) {
        // TODO: implement me
//        String[] dStr  = {};


//            for (String i: ENCODING.keySet()) {
//
//                System.out.println(ENCODING.values());
//            }

//        Object value = ENCODING.get(str);


//        for(int i = 0;i< str.length();i++){
//            if(ENCODING.containsKey(str)){
//                System.out.println(ENCODING.values());
//                System.out.println(ENCODING.containsValue(str.charAt(i)));
//            }
//
//        }

//        for (int i = 0, n = str.length(); i < n; i++) {
//            char c = str.charAt(i);
//            System.out.println(ENCODING.containsValue(str.charAt(i)));
//        }


        for (int i = 0, n = str.length(); i < n; i++) {
            char c = str.charAt(i);
            System.out.println(c);
            System.out.println(ENCODING.replace(str,ENCODING.get(c)));
            System.out.println(ENCODING.values());
            if(ENCODING.containsKey(c)){
                System.out.println(ENCODING.values());
            }

        }
        return str;
    }
    /**
     * Given an ingredient, decode the amount and description, and return a new Ingredient
     * @param line
     * @return
     */
    public static Ingredient decodeIngredient(String line) {
        // TODO: implement me
        return null;
    }

    public static void main(String[] args) {
        // TODO: implement me

        System.out.println(ENCODING.entrySet());
        String str ="hgiif";
        System.out.println(str);

//        for (String i : ENCODING.keySet()) {
//            if (String[i].equals(ENCODING.keySet())) {
//
//            }
//            System.out.println(i);
//        }




//        str.split(str);
//
//        System.out.println(ENCODING.get(str));

        System.out.println(decodeString("hgiif"));




//        str.split(str);
//
//        System.out.println(ENCODING.get(str));

//        System.out.println(decodeString("hgiif"));
    }
}
