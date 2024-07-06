import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write("Hello, world!");
            writer.newLine();
            writer.write("This is another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}