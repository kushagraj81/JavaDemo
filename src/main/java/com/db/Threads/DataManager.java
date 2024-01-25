package com.db.Threads;

import java.util.ArrayList;

public class DataManager  {
    ArrayList<Integer> arr=new ArrayList<Integer>();
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
