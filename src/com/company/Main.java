package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws InterruptedException{
	// write your code here


        class Counter {
            int counter = 0;
            public void increment() { counter++; }
            public int get() { return counter; }
        }

        final Counter counter = new Counter();

        class CountingThread extends Thread {
            public void  run() {
                for (int x = 0; x < 500000; x++) {
                    counter.increment();
                }
            }
        }

        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start(); t2.start();
            t1.join();
            t2.join();


        System.out.println(counter.get());
       /* ThreadTest thread =  new ThreadTest();
        ThreadTest thread1 =  new ThreadTest();
        ThreadTest thread2 =  new ThreadTest();
        thread.start();
        thread1.start();
        thread2.start();*/


        /*int ar[] = { 1, 2, 4, 5, 6, 7, 8 };
        int size = ar.length;
        int a = 0, b = size - 1;
        int mid = 0;
        while ((b - a) > 1)
        {
            mid = (a + b) / 2;
            if ((ar[a] - a) != (ar[mid] - mid))
                b = mid;
            else if ((ar[b] - b) != (ar[mid] - mid))
                a = mid;
        }*/
/*        List<String> first = new ArrayList<String>();
        first.add("one");
        first.add("two");
        first.add("ten");
        first.add("eleven");

        List<String> second = new ArrayList<>();
        second.add("one");
        second.add("two");
        second.add("ten");
        second.add("eleve");

        if(first.equals(second))
        {
            System.out.println("True");
        }

*//*        first.addAll(second);
        if(first.contains("nine"))
        {
            System.out.println("Exist");
        }*//*

        ListIterator<String> iterator = first.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }*/
 /*    int[] a = {10,20,134,23,45,65,10,32};
     Integer[] b  = {10,20,134,23,45,65,10,32};
     Integer[] c = { 20,80,90,40};
     Integer[] d = new Integer[b.length + c.length];

     Object kes = new Object();
     kes.

     Arrays.sort(a);
        System.out.println("Modified arr[] : %s" + Arrays.toString(a));

     int x,y;

     for ( x =0 ; x< b.length; x++ )
     {
         d[x] = b[x];
//         System.out.println(d[x]);
     }
     Integer z = b.length;
     for (y = 0 ; y < c.length; y ++ )
     {
         d[z] = c[y];
//         System.out.println(d[z]);
         z++;
     }

     for(int s : d)
     {
         System.out.println(s);
     }

     List<Integer> list = Arrays.stream(d).distinct().collect(Collectors.toList());
        System.out.println("---------------------");
     for(Integer dup : list)
     {
         System.out.println(dup);
     }

     boolean  onoff=  Arrays.stream(a).boxed().anyMatch(t -> t==0);
     System.out.println("onoff: " + onoff);
     int bina = a.length / 2;
     int j;
     int check = 32;
     System.out.println("bina:" + bina);
     boolean lookfor  = false;
     for(j =0 ; j < bina; j++ )
     {
         if (check == a[j])
         {
             System.out.println("Value exist:" + a[j]);
             lookfor = true ;
         }
     }
        System.out.println("lookfor:" + lookfor);
     if (!lookfor)
         for(j = bina ; j < a.length;j++ )
         {
             if (check == a[j])
             {
                 System.out.println("Value exist:" + a[j]);
             }
         }*/


//     Linear search
/*        for(int i : a)
        {
         if (check == i)
         {
             System.out.println("Value exist:" + i);
         }
        }*/
//        System.out.println("Result:" + IntStream.of(a).anyMatch(t->t==10));
//        boolean k = Arrays.asList(a).contains(20);
/*        int s = Arrays.binarySearch(a,20);
        boolean test  = s > 0 ? true : false;
        System.out.println("Test:" + test  );*/

    }
}
