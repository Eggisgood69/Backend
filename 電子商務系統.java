import java.util.ArrayList;
import java.util.List;

class Product {

    String name; // 商品名稱
    double price; // 商品價格
    int inStock; // 商品庫存

    public Product(String name, double price, int inStock) {

        this.name = name;
        this.price = price;
        this.inStock = inStock;

    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("name:" + name + "price:" + price + "inStock:" + inStock);
    }

}

class User {

    public String userName; // 使用者名稱
    private String password; // 使者密碼

    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;

    }

    public String getuserName() {
        return userName;
    }

    public void printInfo() {
        System.out.println("UserName:" + userName + "password:" + password);
    }
}

class ShoppingCart {

    public List<Product> items;// 購物車

    public ShoppingCart(String Name) {

        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {

        items.add(product);
    }

    public void removeItem(Product product) {

        items.remove(product);
    }

    public List<Product> getItems() {
        return items;
    }

}

public class 電子商務系統 {

    public static void main(String[] args) {

        Product product = new Product("apple\n", 50, 10);
        Product product1 = new Product("orange\n", 100, 8);
        Product product2 = new Product("banana\n", 70, 6);

        User user = new User("Jeff\n", "8888");
        User user1 = new User("Leo\n", "7777");
        User user2 = new User("Sam\n", "6666");

        ShoppingCart shoppingcart = new ShoppingCart(user.getuserName());
        shoppingcart.addItem(product);

        ShoppingCart shoppingcart1 = new ShoppingCart(user1.getuserName());
        shoppingcart1.addItem(product1);

        ShoppingCart shoppingcart2 = new ShoppingCart(user2.getuserName());
        shoppingcart2.addItem(product2);

        product.printInfo();
        product1.printInfo();
        product2.printInfo();
        user.printInfo();
        user1.printInfo();
        user2.printInfo();

    }
}
