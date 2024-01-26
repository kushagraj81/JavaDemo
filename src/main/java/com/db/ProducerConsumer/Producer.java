package com.db.ProducerConsumer;

import java.util.ArrayList;

public class Producer implements Runnable {
    final int LIMIT=6;
    private int questionNumber=0;
    ArrayList<Integer> arr;
    public Producer(ArrayList<Integer> arr)
    {
        this.arr=arr;
    }
    public  void addQuestion(int questionNumber) throws InterruptedException {
        synchronized (arr)
        {
            while(arr.size()==LIMIT)
            {
                System.out.println("List Size full, producer is waiting...");
                arr.wait();
            }

        }
        synchronized (arr)
        {
            arr.add(questionNumber);
            System.out.println("Producer added question : " + questionNumber);
            arr.notify();

        }

    }

    @Override
    public void run() {
        while(true)
        {
            try {
                addQuestion(questionNumber++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
