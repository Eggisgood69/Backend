
// 繼承Thread類
// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running...");
//     }
// }

// // 實現Runnable介面
// class MyRunnable implements Runnable {
//     public void run() {
//         System.out.println("Runnable is running...");
//     }
// }

// public class TestThread {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();
    
//         MyRunnable myRunnable = new MyRunnable();
//         Thread t2 = new Thread(myRunnable);
//         t2.start();
//     }
// }
/////



class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println('Final count: ' + counter.getCount());
    }
}