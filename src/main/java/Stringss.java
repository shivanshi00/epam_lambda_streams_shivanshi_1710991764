import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        filter(Stream.generate(scanner::nextLine).
                limit(10).
                collect(Collectors.toList())).
                forEach(System.out::println);
    }

    private static List<String> filter(List<String> list) {
        return list.
                stream().
                filter(str -> str.startsWith("a") && str.length() == 3).
                collect(Collectors.toList());
    }
}
