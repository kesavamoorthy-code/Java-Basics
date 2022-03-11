package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateExample {

    public static void main(String[] args)
    {
  /*      Date d1 = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd-mm-yyy");
        System.out.println("Current Date:" +  sd.format(d1));*/

        Date now = new Date();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd-MMM-yy HH:mm:ssZ");

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println(simpleDateFormat.format(now));
    }
}
