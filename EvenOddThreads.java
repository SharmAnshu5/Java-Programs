public class EvenOddThreads {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberPrinter(2));
        evenThread.start();

        Thread oddThread = new Thread(new OddNumberPrinter(1));
        oddThread.start();
    }
}

class EvenNumberPrinter implements Runnable {
    private int start;

    public EvenNumberPrinter(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumberPrinter implements Runnable {
    private int start;

    public OddNumberPrinter(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println("odd: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}