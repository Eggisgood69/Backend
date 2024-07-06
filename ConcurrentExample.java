class Job implements Runnable {
    private String jobName;

    public Job(String jobName) {
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

public class ConcurrentExample {
    public static void main(String[] args) {
        Thread job1 = new Thread(new Job("Job1"));
        Thread job2 = new Thread(new Job("Job2"));
        Thread job3 = new Thread(new Job("Job3"));

        job1.start();
        job2.start();
        job3.start();
    }
}