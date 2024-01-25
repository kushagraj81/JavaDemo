package com.db.Threads;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class DataManager  {
    CopyOnWriteArrayList<Integer> arr=new CopyOnWriteArrayList<>();
    public void addDataToDB()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("Added data: " + i);
            arr.add(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void readDataFromDb()
    {
        for(Integer it:arr)
        {
            System.out.println("Fetched Data: " + it);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
