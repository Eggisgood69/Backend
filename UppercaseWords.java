import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        // 完成stream
        List<String> uppercaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

                                           

        System.out.println("Uppercase Words: " + uppercaseWords);
    }
}