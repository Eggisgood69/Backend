import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Enter text (type 'exit' to quit):");
        
        while(!input.equals("exit")) {
            input = scanner.nextLine(); // 讀取用戶輸入
            System.out.println("You entered: " + input);
        }
        
        scanner.close();
        System.out.println("Goodbye!");

        

    }
}