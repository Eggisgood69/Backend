public class App {
    public static void main(String[] args){
        App.talk("123");
        App.talk("456");
        BasicMath.add(10,20);
        BasicMath.multiply(100,5);
    }
    static void talk(String content){
        System.out.println(content);
    }
    
}
class BasicMath{
    static void add(int n1,int n2){
        int result = n1+n2;
        System.out.println(result);
    }
    static void multiply(int n1,int n2){
        int result = n1*n2;
        System.out.println(result);
    }
}

