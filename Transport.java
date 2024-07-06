// 定義交通工具介面
public interface Transport {
    void start();
    void stop();
    void fuelUp();
}

// 定義車類
public class Car implements Transport {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Car refueled.");
    }
}

// 定義飛機類
public class Airplane implements Transport {
    @Override
    public void start() {
        System.out.println("Airplane started.");
    }

    @Override
    public void stop() {
        System.out.println("Airplane landed.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Airplane refueled.");
    }
}

// 主類用於測試
public class Interface {
    public static void main(String[] args) {
        Transport myCar = new Car();
        Transport myPlane = new Airplane();

        myCar.start();
        myCar.fuelUp();
        myCar.stop();

        myPlane.start();
        myPlane.fuelUp();
        myPlane.stop();
    }
}