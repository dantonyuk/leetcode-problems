// https://leetcode.com/problems/print-foobar-alternately/
import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private final Semaphore forFoo = new Semaphore(1);
    private final Semaphore forBar = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            forFoo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            forBar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            forBar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            forFoo.release();
        }
    }
}
