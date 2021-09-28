package generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericMethodPractice {

    public static <T> void printArray (T[] arrayIn) {
        for(T element : arrayIn) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

    public static <T extends Comparable<T>> int greaterThan (T[] numArray, T elem) {
        int count = 0;
        for (T element : numArray) {
            if (element.compareTo(elem) > 0) {
                ++count;
            }
        }

        return count;
    }

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }


    public static <T, G> List<G> fromArrayToListTG(T[] a, Function<T, G> mapperfunction) {
        return Arrays.stream(a)
                .map(mapperfunction)
                .collect(Collectors.toList());

        public static <T extends Number> List<T> fromNumArrayToList(T[] a) {
            return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T extends Number & Comparable<T>> List<T> fromMultipleArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }


    //if we want to use the above method with any subtype of generics.Building
        //we need to employ a wildcard that extends generics.Building

        public static void paintAllBuildings(List<? extends Building> buildings) {
            buildings.forEach(Building::paint);
        }

        //below we have an example of how generic methods are transformed
        //at compile time, exemplifying type erasure. Your generic will
        //typically be replaced by Object if it is unbounded. If it is bounded,
        //it will be replaced by the upper bound.

        public <T> List<T> genericMethod(List<T> list) {
            return list.stream().collect(Collectors.toList());
        }

        //for illustration
        public List<Object> withErasure(List <Object> list) {
            return list.stream().collect(Collectors.toList());
        }

}
