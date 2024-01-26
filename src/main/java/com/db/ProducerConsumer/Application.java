package com.db.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String args[])
    {
        List<Integer> arr = new ArrayList<>();
        Thread thread1 = new Thread(new Producer(arr));
        Thread thread2 = new Thread(new Consumer(arr));
        thread1.start();
        thread2.start();
    }
}
