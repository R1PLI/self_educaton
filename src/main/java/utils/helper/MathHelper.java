package utils.helper;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class MathHelper {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(asList("HELLO", "HI", "SuP"));

        System.out.println("Name is " + getNameInCollection());
        System.out.println("Amount = " + getNameCount());
        System.out.println("Collection size is : " + getNameWithI().size());
        System.out.println("String list with all in upper case " + transformToUpperCase());
        System.out.println("Concat two arrays " + concatTwoLists());
        System.out.println("Min value in array " + minValueInList());
        System.out.println(stringListWithFilter());
        System.out.println("Elements summ " + returnSumInList());
        System.out.println("Musicans are: " + returnBandMusicants());
        System.out.println("Number of lower case characters: " + getCountOfUpperCaseChars("Band"));
        System.out.println("Coolest string: " + getCoolestString(stringList));
        System.out.println(getMinFromStringNumbers("2 3 4 5 6 7", " ").getMin());
    }

    public static String getNameInCollection() {
        Collection<SportHelper> sport;
        sport = asList(
                new SportHelper("Ivan", 15),
                new SportHelper("Ivan", 15),
                new SportHelper("Sergei", 7),
                new SportHelper(null, 7),
                new SportHelper("Vanya", 8)
        );

        return sport.stream()
                .filter(p -> p.getName() != null)
                .max(Comparator.comparing(SportHelper::getDay))
                .get()
                .getName();
    }

    public static long getNameCount() {
        Collection<SportHelper> sport;
        sport = asList(
                new SportHelper("Ivan", 15),
                new SportHelper("Ivan", 15),
                new SportHelper("Sergei", 7),
                new SportHelper(null, 7),
                new SportHelper("Vanya", 8)
        );
        return sport.stream()
                .filter(p -> p.getName() != null && p.getName()
                        .equals("Sergei"))
                .count();
    }

    public static List<SportHelper> getNameWithI() {
        Collection<SportHelper> sport;
        sport = asList(
                new SportHelper("Ivan", 15),
                new SportHelper("Ivan", 15),
                new SportHelper("Sergei", 7),
                new SportHelper(null, 7),
                new SportHelper("Vanya", 8)
        );

        return sport.stream()
                .filter(p -> p.getName() != null && p.getName()
                        .startsWith("I"))
                .collect(toList());
    }

    public static List<String> transformToUpperCase() {
        return Stream.of("a", "b", "c")
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static List<String> stringListWithFilter() {
        return Stream.of("a1", "a2", "a3")
                .filter(s -> s.endsWith("2"))
                .collect(toList());
    }

    public static List<Integer> concatTwoLists() {
        return Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(Collection::stream)
                .collect(toList());
    }

    public static Integer minValueInList() {
        return Stream.of(1, 2, 3)
                .min(Integer::compareTo)
                .get();
    }

    public static long returnSumInList() {
        return Stream.of(1, 2, 3)
                .reduce(0, (acc, value) -> acc + value);
    }


    public static Map<String, String> returnBandMusicants() {
        Collection<MusicHelper> band;
        Map<String, String> resultMap;

        band = asList(
                new MusicHelper("Bred", "Italy"),
                new MusicHelper("George", "Finland"),
                new MusicHelper("Jebesh", "Poland"),
                new MusicHelper("Serj", "Russia"),
                new MusicHelper("Petro", "Ukraine")
        );

        resultMap = band.stream()
                .collect(toMap(MusicHelper::getName, MusicHelper::getCountry)
                );

        return resultMap;
    }

    public static long getCountOfUpperCaseChars(String string) {
        return string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    public static Optional<String> getCoolestString(List<String> stringList) {
        return stringList.stream()
                .max(Comparator.comparing(MathHelper::getCountOfUpperCaseChars));
    }

    public static IntSummaryStatistics getMinFromStringNumbers(String integerSequence, String delimeter) {
        return Arrays.stream(integerSequence.split(delimeter))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
    }
}