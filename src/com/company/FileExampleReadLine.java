package com.company;

import com.company.model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExampleReadLine
{
    public static void main(String[] args)
    {
        String lin;
        int i = 0;

        Employee emp =  new Employee();
        try {
            BufferedReader bf = new BufferedReader(new FileReader("data/copy.txt"));
//            System.out.println(bf.readLine());
            lin = bf.readLine();
            while(lin != null)
            {
                if (!lin.isEmpty()) {
//                    System.out.println(lin.substring(5, 10));
                    emp.setFname(lin.substring(0,9));
                    emp.setMname(lin.substring(9,19));
                    emp.setLname(lin.substring(19,29));
                    emp.setAccountid(lin.substring(29,39));
                    emp.setSalary(Integer.parseInt(lin.substring(39,43)));

                    System.out.println(" Fname:" + emp.getFname() + "Mname:" + emp.getMname()
                            + "Lname:" + emp.getLname() + "Accountid:" + emp.getAccountid()
                    + "  Salary:" + emp.getSalary());
//                    lin.substring(5, 10);
                }
                lin = bf.readLine();

  /*              emp.setFname(line.substring(0,10));
                emp.setMname(line.substring(11,21));
                emp.setMname(line.substring(21,31));
                emp.setAccountid(line.substring(31,40));*/
                i++;
            }

            bf.close();

        }catch(IOException e){
            System.out.println("Exception:" +  e);
        }



    }
}
