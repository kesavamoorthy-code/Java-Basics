package com.company;

public class ThreadTest extends Thread{

    @Override
    public void run()
    {
      System.out.println("Welcome buddy");
      System.out.println(Thread.currentThread());
    }

}
