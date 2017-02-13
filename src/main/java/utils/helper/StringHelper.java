package utils.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class StringHelper {

    private StringHelper() {
    }

    private static Logger logger = LogManager.getLogger(StringHelper.class);

    public static void main(String[] args) {


        //Delimiters
        String charDelimiterComa = ",";

        //Integers
        int startIndex = 5;
        int endIndex = 16;

        //Strings
        String testString = "testingString";
        String testStringDelimiterDots = "t,e.s,t-s,t,r.i,n-g";
        String palindromeString = "abba abba d abba badda tytytyty";
        String searchingWord = "abba";
        String containsWord = "fork";

        //Arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hi", "Hello", "Sup", "privet, medved"};

        //Lists
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        //Separates with delimiter
        logger.info(stringSplitting(testString, charDelimiterComa));
        //Separates with non-word delimiter
        logger.info(stringSplitting(testStringDelimiterDots));
        //Palindrome checking
        logger.info(isPalindrome(palindromeString));
        //Word counting in string
        logger.info(wordCountInString(palindromeString, searchingWord));
        //Integer array to list
        logger.info(integerList);
        fromArrayToCollection(intArray, integerList);
        logger.info(integerList);
        //String array to list
        logger.info(stringList);
        fromArrayToCollection(stringArray, stringList);
        logger.info(stringList);
        //String subSequence
        logger.info(subStringWithVariousLength(testString, startIndex, endIndex));
        //String contains the word
        logger.info(isStringContainsWord(testString, containsWord));
    }

    public static <T> void fromArrayToCollection(T[] array, Collection<T> collection) {
        Collections.addAll(collection, array);
    }

    public static String revertString(String inputString) {

        StringBuilder sb = new StringBuilder(inputString);

        return sb.reverse().toString();
    }

    public static List<String> stringSplitting(String inputString) {

        String[] arrayString;

        arrayString = inputString.split("\\W");

        return Arrays.asList(arrayString);
    }

    public static List<String> stringSplitting(String inputString, String delimiter) {

        String[] arrayString;

        arrayString = inputString.split(delimiter);

        return Arrays.asList(arrayString);
    }

    public static int wordCountInString(String inputString, String searchingWord) {
        int counter = 0;
        List<String> inputStringList = Arrays.asList(inputString.split(" "));

        for (String word : inputStringList) {
            if (word.matches(searchingWord)) {
                counter++;
            }
        }

        return counter;
    }

    public static String subStringWithVariousLength(String inputString, int startIndex, int endIndex) {
        int start = startIndex;
        int end = endIndex;

        if (start < 0) {
            start = 0;
        }

        if (end > inputString.length()) {
            end = inputString.length();
        }

        if (end < start) {
            end = startIndex + 1;
        }
        StringBuilder sb = new StringBuilder(inputString);

        return sb.subSequence(start, end).toString();
    }

    public static boolean isStringContainsWord(String inputString, String word) {
        StringBuilder sb = new StringBuilder(inputString);

        return sb.indexOf(word) != -1;

    }

    public static boolean isStringMatchesToRegEx(String inputString, String regEx) {
        return inputString.matches(regEx);
    }

    public static boolean isPalindrome(String inputString) {
        return inputString.equalsIgnoreCase(revertString(inputString));
    }
}