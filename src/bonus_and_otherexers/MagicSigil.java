package bonus_and_otherexers;


/*A magic sigil is a glyph which represents a desire one wishes to manifest in their lives. There are many ways to create a sigil, but the most common is to write out a specific desire (e.g. "I HAVE WONDERFUL FRIENDS WHO LOVE ME"), remove all vowels, remove any duplicate letters and then design a glyph from what remains.

Using the sentence above as an example, we would remove duplicate letters:

AUFRINDSWHLOVME
And then remove all vowels, leaving us with:

FRNDSWHLVM
Create a function that takes a string and removes its vowels and duplicate letters. The returned string should not contain any spaces and be in uppercase.*/


import java.util.Arrays;

public class MagicSigil {

//    part one : method kick vowels out
    public static String removeVowels(String input){
        String returnstring = input.replaceAll("[AaEeIiOoUu]", "");
        return returnstring;
    };

// part two: duplicate character check
//    first loop = INDEX 0 MATCH INDEX 0 - 1 - 2 - 3 - 4 - 5

    public static void countDupiChar(String input){
        int count = 0;
        char[] inputarray = input.toCharArray();
        for (int i = 0; i < inputarray.length; i++){
            for (int j = i + 1; j < inputarray.length; j++){
                if (inputarray[i] == inputarray[j]){
                    System.out.println("inputarray[j] = " + inputarray[j]);
                    count++;
                }            }
        }
        System.out.println("count = " + count);
    }



    public static void main(String[] args) {
        System.out.println("removeVowels(\"vowels out of here!\") = " + removeVowels("vowels out of here!"));
//countDupiChar("aabcddefgg");
countDupiChar("aab");


    }
}
