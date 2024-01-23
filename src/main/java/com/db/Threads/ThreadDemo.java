package com.db.Threads;

import java.util.*;
public class ThreadDemo {
    public static void main(String args[])
    {
        Task taskRunner = new Task();
//        This start method invokes the run() method of a thread or its child class.
        taskRunner.start();
        System.out.println("Hello kushagra....");
        for(int i=0;i<1000;i++)
        {
            System.out.println("Number In Main: " + i);
        }
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
            System.out.println("Number In Thread: " + i);
        }
    }
}
