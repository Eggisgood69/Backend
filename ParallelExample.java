import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ParallelJob implements Runnable {
    private String jobName;

    public ParallelJob(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(jobName + " is running, iteration: " + i);
            try {
                Thread.sleep(1000); // 模擬工作耗時
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ParallelExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new ParallelJob("Job1"));
        executorService.submit(new ParallelJob("Job2"));
        executorService.submit(new ParallelJob("Job3"));

        executorService.shutdown();
    }
}
