package Threads.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueSample {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);


        Thread producer = new Thread(()-> {
            String[] words = new String[] {"marijuana", "cocain", "geroin", "methamph", "speed"};

            for (int i = 0 ; i < words.length && !Thread.interrupted();) {
            try {
                Thread.sleep(2000);
                queue.put(words[i]);
                System.out.println("producer put the " + words[i] + ",in queue: " + queue.size());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        });

        Thread consumer = new Thread(()-> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(4000);
                    sb.append(queue.take());
                    System.out.println("consumer took the " + sb.reverse() +
                            ",in queue: " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}
