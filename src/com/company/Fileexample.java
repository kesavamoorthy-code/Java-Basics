package com.company;

import java.io.*;

public class Fileexample {

    public static void main(String[] args) throws IOException
    {
       String filePath = "data/test.txt";
        File file = new File(filePath);
        try {
            File nfile = new File("data/tst.txt");
            if (nfile.createNewFile()) {
                System.out.println("New File created");
            } else {
                System.out.println("File exist");
            }
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("File exist:" + file.exists());
        FileInputStream inputf = null;
        FileOutputStream outputf = null;

        try {
            inputf = new FileInputStream(file);
            outputf = new FileOutputStream("data/tst.txt");
            int c;
            while((c = inputf.read()) != -1){
              System.out.println(c);
                outputf.write(c);
            }
        } catch (IOException e)
        {
            System.out.println(e);
        } finally
        {
            if(inputf != null)
            inputf.close();
            if(outputf != null)
                outputf.close();
        }



    }
}
