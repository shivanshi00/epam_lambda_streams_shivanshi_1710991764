package Java8Lambda;

        import java.util.List;
        import java.util.OptionalDouble;
        import java.util.Scanner;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        average(Stream.generate(scanner::nextDouble).
                limit(10).
                collect(Collectors.toList())).
                ifPresent(System.out::println);
    }

    private static OptionalDouble average(List<Double> list) {
        return list.
                stream().
                mapToDouble(value -> value).
                average();
    }
}
