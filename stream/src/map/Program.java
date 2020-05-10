package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> result = Arrays.stream(new String[]{ "Arash", "Ali", "Afshin" })
                .map(a-> "- " + a)
                .collect(Collectors.toList());
        result.forEach(a-> System.out.println(a));


        result = Arrays.stream(new String[][]{ {"Arash", "Farahani"}, {"Ali", "Mirbagheri"}, {"Afshin", "Jafari"} })
                .flatMap(a-> Arrays.stream(a))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.forEach(a-> System.out.println(a));
    }
}
