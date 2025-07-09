package thread;

public class ThreadObjects extends Thread {
    @Override
    public void run() {
        System.out.println("Starting thread");
        long sum = 0L;
        for (long i = 0L; i < 10000000000L; i++) {
            sum += i;
        }

        System.out.println("Finished thread");
    }

    public static void main(String[] args) {
        int MAX = 6;
        for (int i = 0; i < MAX; i++) {
            new ThreadObjects().start();
        }

        System.out.println("Finished Thread Object Main");
    }
}
