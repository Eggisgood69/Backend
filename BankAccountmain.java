class BankAccount {

    private String accountNumber;//帳號
    private double balance;//餘額

    //構造函數
    public BankAccount(String accountNumber,double initialbalance){
        this.accountNumber=accountNumber;
        this.balance=initialbalance;
    }
    //存款方法
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("存款:"+amount+",新餘額:"+balance);
        }else{
            System.out.println("存款金額必須大於零");
        }
    }
    //提款方法
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance=balance-amount;
            System.out.println("提款:"+amount+",新餘額:"+balance);
        }
    }
    //獲取餘額方法
    public double getBalance(){
        return balance;
    }
    //獲取帳戶號碼方法
    public String getAccountNumber(){
        return accountNumber;
    }
}

class AccountHolder {
    private String name;
    private String idNumber;

    //構造函數
    public AccountHolder(String name,String idNumber){
        this.name = name;
        this.idNumber = idNumber;
    }
    //獲取姓名的方法
    public String getName(){
        return name;
    }
    //獲取身分證號碼方法
    public String getidNumber(){
        return idNumber;
    }
}

public class BankAccountmain{
    public static void main(String[]args){
        AccountHolder holder = new AccountHolder("Jeff","A123456789");
        BankAccount account = new BankAccount("12345",2000.0);

        System.out.println("帳戶持有人"+holder.getName());
        System.out.println("帳戶號碼"+account.getAccountNumber());
        System.out.println("初始餘額"+account.getBalance());

        account.deposit(500.0);
        account.withdraw(100.0);

        System.out.println("最終餘額"+account.getBalance());

        


    }

}