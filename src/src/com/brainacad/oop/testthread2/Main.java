package src.com.brainacad.oop.testthread2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.17.3) ");
        System.out.println("--------------------------------------------");

        int[] myArray = new int[1000];
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();

        Random randomGenerator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(1000);
        }

        mySumCount1.setStartIndex(399);
        mySumCount2.setStartIndex(10);

        mySumCount1.setStopIndex(999);
        mySumCount2.setStopIndex(200);

        mySumCount1.setArrayOfInteger(myArray);
        mySumCount2.setArrayOfInteger(myArray);

        mySumCount1.start();
        mySumCount2.start();

        try {

            mySumCount1.join();
            mySumCount2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("Sum in mySumCount1 = " + mySumCount1.getResultSum());
        System.out.println("Sum in mySumCount2 = " + mySumCount2.getResultSum());


        System.out.println("******************************************");
        System.out.println("Labwork 2.17.4) ");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(1000);
        }

        MySumCount2 mySumCount3 = new MySumCount2();
        MySumCount2 mySumCount4 = new MySumCount2();


        mySumCount3.setStartIndex(300);
        mySumCount4.setStartIndex(106);

        mySumCount3.setStopIndex(400);
        mySumCount4.setStopIndex(567);

        mySumCount3.setArrayOfInteger(myArray);
        mySumCount4.setArrayOfInteger(myArray);

        Thread thread1 = new Thread(mySumCount3);
        Thread thread2 = new Thread(mySumCount4);

        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("Sum in mySumCount3 = " + mySumCount3.getResultSum());
        System.out.println("Sum in mySumCount4 = " + mySumCount4.getResultSum());

        System.out.println("******************************************");
    }
}
