import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LogAnalyzer {
    public static void main(String[] args) {
        Map<String, Integer> errorCount = new HashMap<>();
        
        // 讀取日誌文件
        try (BufferedReader reader = new BufferedReader(new FileReader("log.txt"))) {
            String line;//一行讀取資料
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    errorCount.merge(line, 1, Integer::sum);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 寫入結果
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            for (Map.Entry<String, Integer> entry : errorCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}