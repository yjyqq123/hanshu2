package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        List<Integer> integers = new ArrayList<>();
        Random rm = new Random();
        int tempvalue= rm.nextInt(100) + 1;
        int totalCount = 1;
        Long begin = System.currentTimeMillis();
        while (integers.size() != 100) {
            totalCount++;
            if (integers.contains(tempvalue)) {
                tempvalue = rm.nextInt(100) + 1;
            } else {
                integers.add(tempvalue);
                System.out.println(tempvalue);
            }
            File file=new File("D:/myCounter.text");
            Writer writer=new FileWriter(file,true);
            PrintWriter out=new PrintWriter(writer);
            out.println(tempvalue);
            out.flush();
            out.close();
            writer.close();
        }
    }

}
