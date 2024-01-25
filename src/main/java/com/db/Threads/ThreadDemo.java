package com.db.Threads;

import java.util.*;
public class ThreadDemo {
    public static void main(String args[])
    {
//        Task taskRunner = new Task();
//        taskRunner.setName("YashThread");
////        This start method invokes the run() method of a thread or its child class.
//        taskRunner.start();
//        System.out.println("Hello kushagra....");
//        Task taskRunner2= new Task();
//        taskRunner2.setName("KushThread");
//        taskRunner2.start();


//        In the below provided code we are imitating the db insert and fetch operation
//        the code shows a problem of concurrent data access from database.
//        Because they were accessing the same variable at same time so we had concurrent access issue
        DataManager manager= new DataManager();
        Thread thread1 =new Thread(new Runnable() {
            @Override
            public void run() {
                manager.addDataToDB();
            }
        });
        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                manager.readDataFromDb();
            }
        });
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
class Task extends Thread{
//    abstract method of runnable interface
//    thread class extends runnable interface
//    So practically we are overriding run method here.
    @Override
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("Number In Thread: " + i + "Thread name : " + Thread.currentThread().getName()) ;
        }
    }
}
