import java.util.Scanner;

public class guess {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            float number = (float)Math.random();
            
            number *=100.0f;
            
            int number1 = (int)number;

            int guess;
            // System.out.print(number1);
            do {

                System.out.print("請輸入數字(1~100):");
                guess = scanner.nextInt();
                
                if(guess>number1){
                    System.out.println("猜大了");
                }else if(guess<number1){
                    System.out.println("猜小了");
                }else{
                    System.out.println("猜對了!");
                }
            // break;
            }while(guess!=number1);
        scanner.close();
    }
}  