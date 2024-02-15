package lambda_practice.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach((x) -> System.out.print(x));

        Stream.of("hello", "Ana")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));
        System.out.println();

        Stream<String> lines = Files.lines(Paths.get("/wordFile.txt"));
        lines.sorted()
                .filter(l->l.length()>6)
                .forEach(x-> System.out.print(x+", "));
        lines.close();
    }
}
