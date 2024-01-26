package com.db.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
    List<Integer> arr=null;
    public Consumer(List<Integer> arr)
    {
        this.arr=arr;
    }
    public  void answerQuestion() throws InterruptedException {
        synchronized (arr)
        {
            while(arr.isEmpty())
            {
                System.out.println("List is empty consumer is waiting...");
                arr.wait();
            }

        }
        synchronized (arr)
        {
            System.out.println("Consumer solved question : " + arr.remove(0));
            Thread.sleep(5000);
            arr.notify();
        }

    }

    @Override
    public void run() {
        while(true)
        {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
