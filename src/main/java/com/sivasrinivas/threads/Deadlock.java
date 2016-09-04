package com.sivasrinivas.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sivasrinivas
 * @date 8/24/16
 */
public class Deadlock implements Runnable {
    private final int threadId;
    private final ReentrantLock lock1;
    private final ReentrantLock lock2;
    private final CountDownLatch latch;

    public Deadlock(int threadId, ReentrantLock lock1, ReentrantLock lock2, CountDownLatch latch) {
        this.threadId = threadId;
        this.lock1 = lock1;
        this.lock2 = lock2;
        this.latch = latch;
    }

    public static void main(String[] args) {
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();
        CountDownLatch latch = new CountDownLatch(1);
        Deadlock deadlock = new Deadlock(1, lock1, lock2, latch);
        Deadlock deadlock2 = new Deadlock(2, lock1, lock2, latch);

        Thread t1 = new Thread(deadlock);
        Thread t2 = new Thread(deadlock2);
        t1.start();
        t2.start();

        latch.countDown();
    }

    @Override
    public void run() {
        try {
            latch.await();

            if (threadId==1) {
                //thread 1
                lock1.lock();
                System.out.println("Thread1 Acquired lock1");
                lock2.lock();
                System.out.println("Thread1 Acquired lock2");
                System.out.println("Success1");
                lock1.unlock();
                lock2.unlock();
                System.out.println("Done1");
            } else {
                //thread 2
                lock2.lock();
                System.out.println("Thread2 Acquired lock2");
                lock1.lock();
                System.out.println("Thread2 Acquired lock1");
                System.out.println("Success2");
                lock2.unlock();
                lock1.unlock();
                System.out.println("Done2");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
