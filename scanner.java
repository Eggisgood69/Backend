import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入您的姓名:");
        String name = scanner.nextLine();

        System.out.print("請輸入您的年齡:");
        int age = scanner.nextInt();   

        System.out.print("請輸入您的體重:");
        float weight = scanner.nextFloat();

        int selectgender;
        while(true) {
            System.out.println("***請選擇您的性別***");
            System.out.println("1.男性/male");
            System.out.println("2.女性/female");

            selectgender = scanner.nextInt();
            switch (selectgender) {
                case 1:
                    System.out.printf("你好，%s~\n年齡是%s歲\n體重是%.2fKG\n性別是男生\n",name,age,weight,selectgender);
                    
                    break;
                case 2:
                    System.out.printf("你好，%s~\n年齡是%s歲\n體重是%.2fKG\n性別是女生\n",name,age,weight,selectgender);
                    
                    break;

                default:
                    System.out.println("選取錯誤，請重新選取");
                    continue;
            }break;
        }   
        System.out.println("很高興認識你");
        scanner.close();
    }
}