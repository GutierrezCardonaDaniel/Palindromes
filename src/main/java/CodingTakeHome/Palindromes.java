package CodingTakeHome;

public class Palindromes {
    public static String classifyPalindrome(String palindrome){

        String palindromeNoSpecialChr = palindrome.replaceAll("[-—]| {2,}"," .")
                .replaceAll("[^a-z A-Z]","").trim();
        String[] wordsArray = palindromeNoSpecialChr.split(" ");
        String[] reversedArray =revertArray(wordsArray);
        int numbWords = wordsArray.length;
        String palindromeNoSpaces =palindromeNoSpecialChr.replaceAll(" ","");
        String reversedWord= revertWord(palindromeNoSpaces);
        //String reversedWord= new StringBuilder(palindromeNoSpaces).reverse().toString();

        if (reversedWord.equalsIgnoreCase(palindromeNoSpaces)) {
            if (numbWords == 1) {
                return palindrome + " (Single Word Palindrome)";
            } else if (numbWords == 2) {
                return palindrome + " (Two Words Palindrome)";
            } else if (2 < numbWords && numbWords < 5) {
                return palindrome + " (Multiple Words Palindrome)";
            } else if (5 < numbWords) {
                return palindrome + " (Hell of a Palindrome)";
            }
        }else if(isArrayEqualIgnoreCase(wordsArray,reversedArray)) {
            return palindrome + " (Word by Word palindrome)";
        }else {
            return palindrome + " (is not a palindrome)";
        }
        return "";
    }

    private static String revertWord(String word) {
        String reversedWord = "";
        for (int index = word.length() - 1; index >= 0; index--) {
            reversedWord += word.charAt(index);
        }
        return reversedWord;
    }
    private static String[] revertArray(String[] wordsArray){
        String[] reversedArray= new String[wordsArray.length];
        for (int index = 0; index<wordsArray.length ; index++) {
            reversedArray[wordsArray.length-1-index]=wordsArray[index];
        }
        return reversedArray;
    }
    private static boolean isArrayEqualIgnoreCase(String[] array1, String[] array2){
        boolean areEqual = true;
        if (array1.length==array2.length) {
            for (int index = 0; index < array1.length;index++) {
                areEqual = areEqual && array1[index].equalsIgnoreCase(array2[index]);
            }
        }else {
            areEqual=false;
        }
        return areEqual;
    }
}
