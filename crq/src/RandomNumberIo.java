import java.io.*;
import java.util.*;

/**
 * @author CRQ
 */
public class RandomNumberIo {


    public static void main(String[] args) throws IOException {

        List<Integer> integers=new ArrayList<>();
        Random rm = new Random();
        int value = rm. nextInt(100)+1;
        int totalCount =1;
        Long begin= System.currentTimeMillis();
        while (integers.size() != 100) {
            totalCount++;
            if (integers.contains(value)) {
                value = rm.nextInt(100)+1;
            } else {
                integers.add(value);
                System.out.println(value);
            }
        }
        System.out.println("while循环次数："+totalCount);
        Iterator<Integer> it = integers.iterator();
        int count = 0;
        while(it.hasNext()){
            System.out.println("第"+ ++count +"个随机数 =="+it.next());
        }
        Long end= System.currentTimeMillis();
        System.out.println("花费的总时间"+(end - begin));
}

    }

