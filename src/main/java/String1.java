package src.main.java;

public class string_1
{
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *  helloName("Bob") → "Hello Bob!"
     *  helloName("Alice") → "Hello Alice!"
     *  helloName("X") → "Hello X!"
     */
    public String helloNameMethod(String name) {
        return "Hello " + name + "!";
    }




    /*
     * Given two strings, a and b, return the result of putting them together in the order abba, 
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") → "HiByeByeHi"
     * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     * makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }


    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * makeTags("i", "Yay") → "<i>Yay</i>"
     * makeTags("i", "Hello") → "<i>Hello</i>"
     * makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */

    public String makeTags(String tags,String word){
    return "<"+tags+">"+word+"</"+tags+">";
    }

    

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, 
     *      return a new string where the word is in the middle of the out string, 
     *      e.g. "<<word>>". 
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but 
     * not including index j.
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word +out.substring(2);}

    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     */
  
        public String extraEnd3(String word) {
            String lastChars = word.substring(word.length() - 2);
            return lastChars + lastChars + lastChars;
        }
       
    /*
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
     * If the string is shorter than length 2, return whatever there is, 
     * so "X" yields "X", and the empty string "" yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * firstTwo("Hello") → "He"
     * firstTwo("abcdefg") → "ab"   
     * firstTwo("ab") → "ab"
     */

        public String extraEnd2(String word) {
            if (word.length()>3)
            {return word.substring(0,2); }
            else
            {return word.substring(0,2) ;}
        }


    /*
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".]
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     */
        public String firstHalf(String str) {
            return str.substring(0, str.length() / 2);
        }

    

    /*
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
     * The string length will be at least 2.
     * withoutEnd("Hello") → "ell"
     * withoutEnd("java") → "av"
     * withoutEnd("coding") → "odin"
     */
        public String withoutEnd(String word) {

 return  word.substring(1,word.length()-1);
        }
       
    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with the 
     * shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     */


        public String comboString(String a, String b) {
        if(a.length()>b.length())
            {return b+a+b;}
        else
            {return a+b+a ;}
        }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
     * The string length will be at least 3.
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     */
    

        public String middleThree(String str) {
            int midIndex = str.length() / 2;
            return str.substring(midIndex - 1, midIndex + 2);
    
    }
    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     * extraFront("Hello") → "HeHeHe"
     * extraFront("ab") → "ababab"
     * extraFront("H") → "HHH"
     */

        public String extraFront(String str) {
            if (str.length()> 2)
            {return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);}
    else{return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);}
    
        }


    /*
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
     * The string length will be at least 2.
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     */

    public String left2(String str) {
        // Move the first 2 characters to the end
        return str.substring(2) + str.substring(0, 2);
    }


    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * hasBad("badxx") → true
     * hasBad("xbadxx") → true
     * hasBad("xxbadxx") → false
     */

        public boolean hasBad(String str) {
            int Index = str.indexOf("bad");
            if (Index == 0)
            {return false;}
            else{return true;}
            ;
        }



    /*
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the concatenation creates a double-char, then omit one of the chars, 
     * 	so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     */

        public String conCat(String a, String b) {
            // Check if the last character of 'a' is the same as the first character of 'b'
            if (a.substring(1).equals(b.subtring(0,1))) {
                // Concatenate 'a' and 'b', omitting the first character of 'b'
                return a + b.substring(b.length() -1);
            }
            // Otherwise, just concatenate 'a' and 'b' con - cat - ate = with cat eat 
            return a + b;
        }
   

    /*
     *Given two strings, append them together (known as "concatenation") and return the result. 
     *However, if the strings are different lengths, omit chars from the longer string 
     *	so it is the same length as the shorter string. 
     *So "Hello" and "Hi" yield "loHi". 
     *The strings may be any length.
     *minCat("Hello", "Hi") → "loHi"
     *minCat("Hello", "java") → "ellojava"
     *minCat("java", "Hello") → "javaello"
     */

        public String minCat(String a, String b) {
        if(a.length()>b.length())
{ String total = a.substring(a.length()-b.length()) + b;
    return total;}
else{String total = a+b.substring(b.length() - a.length());
    return total ;}
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
     * and otherwise return the string unchanged.
     * withoutX("xHix") → "Hi"
     * withoutX("xHi") → "Hi"
     * withoutX("Hxix") → "Hxi"
     */
  
    public String withoutX(String str) {
        if (str.length() == 0) {
            return str;
        }
                if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }
m         if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        
        return str;
    }
    /*
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
     * The string may be any length. 
     * Harder than it looks.
     * deFront("Hello") → "llo" 
     * deFront("java") → "va"
     * deFront("away") → "aay"
     */
        public String deFront(String str) {    
         if (str.length()<2)   
        return str;
        else{    String result = "";
        if (str.charAt(0) == 'a') {
            result += 'a';
        }
        if (str.charAt(1) == 'b') {
            result += 'b';
        }
        result += str.substring(2);
    
        return result;
    }}

