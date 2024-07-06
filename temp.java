import java.util.Scanner;

public class temp{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入溫度(華式):");
        float tempC = scanner.nextFloat();
        float tempF = tempC*9/5+32;

        if (tempC>30){
            System.out.printf("攝氏溫度是%.2f華氏溫度是%.2f,太熱了",tempC,tempF);
        }else if(tempC<20){
            System.out.printf("攝氏溫度是%.2f華氏溫度是%.2f,太冷了",tempC,tempF);
        }else{
            System.out.printf("攝氏溫度是%.2f華氏溫度是%.2f,適合的溫度",tempC,tempF);
        }
        scanner.close();
    }
}
