package com.db.ProducerConsumer;

import java.util.ArrayList;

public class Consumer implements Runnable {
    ArrayList<Integer> arr;
    public Consumer(ArrayList<Integer> arr)
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
            System.out.println("Producer added question : " + arr.remove(0));
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
