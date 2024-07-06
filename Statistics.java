import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Statistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 20, 35, 40, 55);

        // 完成stream
        IntSummaryStatistics stats = numbers.stream()
                                            .mapToInt(Integer::intValue)
                                            .summaryStatistics();

        IntSummaryStatistics stats1 = new IntSummaryStatistics() ;
        for (int i : numbers){
            stats1.accept(i);
        }

        System.out.println("Highest number: " + stats.getMax());
        System.out.println("Lowest number: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());

        System.out.println("Highest number: " + stats1.getMax());
        System.out.println("Lowest number: " + stats1.getMin());
        System.out.println("Average: " + stats1.getAverage());
    }
}
