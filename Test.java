import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 完成stream
        int sum = numbers.stream()
                         .filter(n->n%2==0)
                         .reduce(0,Integer::sum);  


        int sum1=0;
        for(Integer i:numbers){
            if(i%2==0){
                sum1+=i;
            }

        }                    

        


        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Sum of even numbers: " + sum1);

    }
}
