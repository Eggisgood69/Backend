import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriteExample {
    public static void main(String[] args) {
        String column = "姓名,年齡,地區";
        String[] data = {
            "John,25,Los Angeles",
            "Jane,30,New York",
            "Emily,22,Chicago"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"))) {
            bw.write(column);
            bw.newLine();
            for (String record : data) {
                bw.write(record);
                bw.newLine(); // 換行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}