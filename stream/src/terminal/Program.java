package terminal;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println("Stream without terminal operation");
        Arrays.stream(new int[]{ 1, 2, 3 }).map(a-> {
            System.out.println("doubling 1: " + a);
            return a * 2;
        });

        System.out.println("Stream with terminal operation");
        Arrays.stream(new int[]{ 1, 2, 3 }).map(a-> {
            System.out.println("doubling 2: " + a);
            return a * 2;
        }).sum();
    }
}
