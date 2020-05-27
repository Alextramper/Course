package Stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> users = new LinkedList<>();
        users.add("Иван");
        users.add("Женя");
        users.add("Вася");
        users.add("Саймон");
        users.add("Трисс");
        users.add("Терри");

        /*Predicate<String> predicate = new Predicate<String>() {

            @Override
            public boolean test(String s) {
                return s.startsWith("Ж");
            }
        };*/

       users.stream().forEach(x -> System.out.println(x));

       List<String> filteredList = users.stream().filter(x -> x.startsWith("Т"))
                                    .collect(Collectors.toList());
        System.out.println(filteredList);
    }
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
    }

