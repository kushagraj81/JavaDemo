package com.db.ProducerConsumer;

import java.util.ArrayList;

public class Application {
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Thread thread1 = new Thread(new Producer(arr));
        Thread thread2 = new Thread(new Consumer(arr));
        thread1.run();
        thread2.run();


    }
}
