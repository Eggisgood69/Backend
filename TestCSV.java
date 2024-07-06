import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestCSV {
    public static void main(String[] args) {
        String[] data = {
            "John,88,class A",
            "Jane,90,class b",
            "Emily,67,class c"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Class.csv"))) {
            for (String record : data) {
                bw.write(record);
                bw.newLine(); // 換行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}