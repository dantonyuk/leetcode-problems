// https://leetcode.com/problems/print-zero-even-odd/
import java.util.concurrent.Semaphore;

class ZeroEvenOdd {
    private int n;
    private volatile int x;
    private final Semaphore semZero = new Semaphore(1);
    private final Semaphore semEven = new Semaphore(0);
    private final Semaphore semOdd = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (;;) {
            try {
                semZero.acquire();
                if (x == n) break;
                printNumber.accept(0);
            }
            finally {
                (x % 2 == 0 ? semOdd : semEven).release();
            }
        }
        (x % 2 == 0 ? semEven : semOdd).release();
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        nonZero(printNumber, semEven);
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        nonZero(printNumber, semOdd);
    }

    private void nonZero(IntConsumer printNumber, Semaphore sem) throws InterruptedException {
        for (;;) {
            try {
                sem.acquire();
                x++;
                if (x > n) return;
                printNumber.accept(x);
            }
            finally {
                semZero.release();
            }
        }
    }
}
