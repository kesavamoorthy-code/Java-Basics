package com.company;

import java.util.*;

public class NumberProblem {
    public static void main(String[] args)
    {
        Integer[] a = {5,7,4,3,5,7,8,10,82,10,90};
        Integer key = 100;
        int Result;
        List<Integer> c  = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        Integer count = 0;
        int inc;
        /*Integer[] r = {0,1,2,3,4,5,6,8,9};
        int len = r.length;
        int mid = */
        //find duplicates
        // find no of occurences of an element
        //sum of two elements exist in an arrya
        // find a number is prime
        // Implement your own sort
        // find missing number in a range

        //find missing number in a range

        //find duplicates
        List<Integer> list = Arrays.asList(a);
        for(inc = 0 ; inc < a.length; inc ++)
        {
            Result  = key - a[inc];
            if (list.contains(Result))
            {
                System.out.println("Sum of two:" + a[inc] + "," + Result);
            }
        }
        for(Integer i : a)
        {
           count   = map.get(i);
           map.put(i,(map.get(i) == null ? 1 : count +1));

           if(set.add(i))
           {

         }else
           {
               System.out.println("Duplicate:" + i);
           }
        }
        for(Map.Entry<Integer,Integer> ent : map.entrySet())
        {
            System.out.println(" Occurences:" +  "  " + ent.getKey()  + ":" + ent.getValue() );
        }


/*        for(Integer i : list)
        {
            System.out.println("printing I :" + i);
        }*/

    }
}
