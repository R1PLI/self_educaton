package utils.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.StringUtils;
import java.util.*;


/**
 * The type String helper.
 */
public class StringHelper {

    private StringHelper() {
    }

    private static Logger logger = LogManager.getLogger(StringHelper.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
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
        String myEmail = "Oleksandr_Pochernin@epam.com";
        String RegExEmail = "([\\w-\\.]+)@((?:[\\w]+\\.)+)(\\w{2,4})";

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
        //String matches RegEx
        logger.info(isStringMatchesToRegEx(myEmail,RegExEmail));
    }

    /**
     * Method that transfer items from array to collection.
     *
     * @param <T>        the type parameter
     * @param array      the array
     * @param collection the collection with array's item
     */
    public static <T> void fromArrayToCollection(T[] array, Collection<T> collection) {
        Collections.addAll(collection, array);
    }

    /**
     * Method for revert the string.
     *
     * @param inputString the input string
     * @return reverted string
     */
    public static String revertString(String inputString) {

        StringBuilder sb = new StringBuilder(inputString);

        return sb.reverse().toString();
    }

    /**
     * Method for split string into list by non-word delimiters
     *
     * @param inputString the input string
     * @return the list that contains string separated by non-word delimiters
     */
    public static List<String> stringSplitting(String inputString) {

        String[] arrayString;

        arrayString = inputString.split("\\W");

        return Arrays.asList(arrayString);
    }

    /**
     * Method for split string into list by various delimiter
     *
     * @param inputString the input string
     * @param delimiter   the delimiter
     * @return the list that contains string separated by various delimiter
     */
    public static List<String> stringSplitting(String inputString, String delimiter) {

        String[] arrayString;

        arrayString = inputString.split(delimiter);

        return Arrays.asList(arrayString);
    }

    /**
     * Count how many times word are appears in string.
     *
     * @param inputString   the input string
     * @param searchingWord the searching word
     * @return the number of entries by substring in string
     */
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

    /**
     * Method that returns substring with various length of current string
     *
     * @param inputString the input string
     * @param startIndex  the start index
     * @param endIndex    the end index
     * @return the substring of string
     */
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

    /**
     * Method that shows presence of the word in string
     *
     * @param inputString the input string
     * @param word        the word
     * @return boolean flag
     */
    public static boolean isStringContainsWord(String inputString, String word) {
        StringBuilder sb = new StringBuilder(inputString);

        return sb.indexOf(word) != -1;

    }

    /**
     * Is string matches to reg ex boolean.
     *
     * @param inputString the input string
     * @param regEx       the reg ex
     * @return boolean flag
     */
    public static boolean isStringMatchesToRegEx(String inputString, String regEx) {
        return inputString.matches(regEx);
    }

    /**
     * Method that shows is string a palindrome
     *
     * @param inputString the input string
     * @return boolean flag
     */
    public static boolean isPalindrome(String inputString) {
        return inputString.equalsIgnoreCase(revertString(inputString));
    }
}