import java.util.ArrayList;
import java.util.List;

class PrimeCalculator implements Runnable {
    private int start;
    private int end;
    private List<Integer> primes;

    public PrimeCalculator(int start, int end) {
        this.start = start;
        this.end = end;
        this.primes = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public List<Integer> getPrimes() {
        return primes;
    }
}

public class PrimeCalculatorTest {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 10000000;
        int numberOfThreads = 10;
        int rangePerThread = (rangeEnd - rangeStart + 1) / numberOfThreads;

        List<Thread> threads = new ArrayList<>();
        List<PrimeCalculator> calculators = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfThreads; i++) {
            int start = rangeStart + i * rangePerThread;
            int end = (i == numberOfThreads - 1) ? rangeEnd : start + rangePerThread - 1;
            PrimeCalculator calculator = new PrimeCalculator(start, end);
            Thread thread = new Thread(calculator);
            threads.add(thread);
            calculators.add(calculator);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        List<Integer> allPrimes = new ArrayList<>();
        for (PrimeCalculator calculator : calculators) {
            allPrimes.addAll(calculator.getPrimes());
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // System.out.println("Primes in range " + rangeStart + " to " + rangeEnd + ": " + allPrimes);
        System.out.println("multi thread Time used: " + duration + " ms");

        startTime = System.currentTimeMillis();
        PrimeCalculator origin = new PrimeCalculator(rangeStart, rangeEnd);
        origin.run();
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        // System.out.println("Primes in range " + rangeStart + " to " + rangeEnd + ": " + origin.getPrimes());
        System.out.println("single thread Time used: " + duration + " ms");

    }
}