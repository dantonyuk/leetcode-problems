// https://leetcode.com/problems/building-h2o/
import java.util.concurrent.*;

class H2O {

    private Semaphore hydrogenBarrier = new Semaphore(2);
    private Semaphore oxygenBarrier = new Semaphore(0);

    public H2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogenBarrier.acquire();
        releaseHydrogen.run();
        oxygenBarrier.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygenBarrier.acquire(2);
		releaseOxygen.run();
        hydrogenBarrier.release(2);
    }
}
