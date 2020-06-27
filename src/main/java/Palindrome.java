import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        palindromes(Stream.generate(scanner::nextLine).
                limit(10).
                collect(Collectors.toList())).
                forEach(System.out::println);
    }

    private static List<String> palindromes(List<String> list) {
        return list.
                stream().
                filter(str -> new StringBuilder(str).reverse().toString().equals(str)).
                collect(Collectors.toList());
    }
}
