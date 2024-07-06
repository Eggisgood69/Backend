import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 使用 reduce 終端操作來計算數字的總和
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        
        int sum1 = 0;                
        for (Integer i : numbers) {
            sum1 += i;
        }
        System.out.println("Sum: " + sum);  // 產生結果
        System.out.println("Sum1: " + sum1);
        
        // 使用 forEach 進行迭代，產生副作用（印出每個數字）
        numbers.stream()
               .forEach(System.out::println);
               
        for (Integer i : numbers) {
            System.out.println(i);
        }

        // 使用 collect 收集元素到新的列表
        List<Integer> doubled = numbers.stream()
                                       .map(n -> n * 2)
                                       .collect(Collectors.toList());
        System.out.println("Doubled List: " + doubled);  // 產生結果
        
        List<Integer> doubled1 = new ArrayList<>();
        for (Integer i : numbers) {
            doubled1.add(i*2);
        }
        System.out.println("Doubled1 List: " + doubled1); 
    }
}