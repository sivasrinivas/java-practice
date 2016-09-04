package com.sivasrinivas.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author sivasrinivas
 * @date 8/30/16
 */
public class ProducerConsumerBQ {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(10);
        Thread prodThread = new Thread(new Producer(queue));
        Thread consThread = new Thread(new Consumer(queue));
        consThread.start();
        prodThread.start();
    }
}

class Producer implements Runnable {
    private final BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Produced: " + i);
                queue.put(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {

    private final BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer value = (Integer) queue.take();
                System.out.println("Consumer: " + value.intValue());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
