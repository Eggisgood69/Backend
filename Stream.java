import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 82),
            new Student("Bob", 55),
            new Student("Charlie", 68),
            new Student("David", 49)
        );

        // 篩選及格的學生並印出他們的名字
        students.stream()
                .filter(student -> student.getScore() >= 60)
                .map(Student::getName)
                .forEach(System.out::println);  // 輸出 Alice, Charlie
    }
}
