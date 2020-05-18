// https://leetcode.com/problems/print-in-order/
import java.util.concurrent.*;

class Foo {

    private final CountDownLatch forSecond = new CountDownLatch(1);
    private final CountDownLatch forThird = new CountDownLatch(1);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        forSecond.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        forSecond.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        forThird.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        forThird.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
