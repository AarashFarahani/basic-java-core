package stream;

import java.util.Arrays;

public class MapApp {
    public static void main(String[] args) {
        int[] integerList = Arrays.stream(new int[] { 1, 2, 3 })
                .map(i -> i * 2)
                .toArray();

        Arrays.stream(integerList).forEach(a-> System.out.println(a));

        System.out.println("******************************************************");

        int result = Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        }).sum();

        System.out.println(result);
    }
}
