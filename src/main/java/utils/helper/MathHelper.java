package utils.helper;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class MathHelper {
    public static void main(String[] args) {
        streamPractice();


    }

    public static void streamPractice() {
        Collection<SportHelper> sport;
        List<SportHelper> onlyI;
        String campPeople;
        long nameCount;
        String name;
        Integer daySum;
        List<String> stringList;
        List<String> stringToUpperCase;
        List<Integer> concatList;

        sport = asList(
                new SportHelper("Ivan", 15),
                new SportHelper("Ivan", 15),
                new SportHelper("Sergei", 7),
                new SportHelper(null, 7),
                new SportHelper("Vanya", 8)
        );

        name = sport.stream()
                .filter(p -> p.getName() != null)
                .max(Comparator.comparing(SportHelper::getDay))
                .get()
                .getName();

        nameCount = sport.stream()
                .filter(p -> p.getName() != null && p.getName()
                        .equals("Sergei"))
                .count();

        onlyI = sport.stream()
                .filter(p -> p.getName() != null && p.getName()
                        .startsWith("I"))
                .collect(Collectors.toList());

        campPeople = sport.stream()
                .filter(p -> p.getName() != null)
                .map(SportHelper::getName)
                .collect(Collectors.joining(" and ", "In camp ", " rest all days."));

        daySum = sport.stream()
                .reduce(0, (sum, p) -> sum += p.getDay(), (sum1, sum2) -> sum1 + sum2);

        stringList = Stream.of("a1", "a2", "a3")
                .filter(s -> s.endsWith("2"))
                .collect(Collectors.toList());

        stringToUpperCase = Stream.of("a", "b", "c")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        concatList = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("Name is " + name);
        System.out.println("Amount = " + nameCount);
        System.out.println("Collection size is : " + onlyI.size());
        System.out.println(campPeople);
        System.out.println("DaySize = " + daySum);
        System.out.println("Array list " + stringList);
        System.out.println("String list with all in upper case " + stringToUpperCase);
        System.out.println("Concat two arrays " + concatList);
    }

}
