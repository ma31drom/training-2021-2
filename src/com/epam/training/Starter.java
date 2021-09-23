package com.epam.training;

import com.epam.training.internal.SecondClass;

import java.net.URI;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Starter {

    public static final String VERY_IMPORTANT_CONSTANT = "123";

    public static void main(String[] args) {

        int i = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);

        // we are doing something wrong
        ifThenElseSampleMethod(i);

        /*
        we
        are doing something wrong
         */
        switchSampleMethod(i);

        whileSampleMethod();

        forSampleMethod();

        forEachSample();

        continueSampleMethod();

        int found = returnSomethingSample();
        System.out.println(found);

        returnSample();


        FirstClass ourClass = new FirstClass();
        FirstClass ourClass2 = new FirstClass();

        System.out.println("Value of clazzField in the beggining: " + FirstClass.clazzField);

        FirstClass.clazzField = 5;

        System.out.println("Value of clazzField in the first obj: " + ourClass.clazzField);
        System.out.println("Value of clazzField in the second obj: " + ourClass2.clazzField);

        SecondClass d;
        d = SecondClass.getInstance();

        ourClass.testMethod();

        //new RecursionFirstClass().recurse();
        new InitializingClass();

        ConnectionProvider connectionProvider = new ConnectionProvider();

        String str = "http://google.com";
        URI uri = URI.create(str);

        connectionProvider.createConnection();
        connectionProvider.createConnection(uri);
        connectionProvider.createConnection(str);

    }

    private static int returnSomethingSample() {
        return (int) (Math.random() * 100);
    }

    private static void returnSample() {
        while (true) {
            int result = (int) (Math.random() * 100);
            System.out.println("Generated value = " + result);
            if (result > 90) {
                return;
            }
        }
    }

    private static void continueSampleMethod() {
        int[] array = {1, 2, 3, 4, 7, 9, 19};
        int i = 0;
        for (int arrayElement : array) {
            i++;
            if (arrayElement % 2 == 1) {
                continue;
            }
            System.out.println("Even: Array element [" + (i - 1) + "] = " + arrayElement);
        }
    }

    private static void forEachSample() {
        int[] array = {1, 2, 3, 4, 7, 9, 19};
        int i = 0;
        for (int arrayElement : array) {
            System.out.println("Array element [" + i + "] = " + arrayElement);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println("Option 2: Array element [" + j + "] = " + array[j]);
        }
    }

    private static void forSampleMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    /**
     * This method iterates from 1 to 19 and prints numbers to the console.
     */
    private static void whileSampleMethod() {

        int a = 1;

        while (a != 10) {
            System.out.println("a = " + a);
            a++;
        }

        do {
            System.out.println("a = " + a);
            a++;
        } while (a != 20);

    }

    private static void switchSampleMethod(int i) {
        switch (i) {
            case 1: {
                System.out.println("Today is SUNDAY");
                break;
            }
            case 2: {
                System.out.println("Today is MONDAY");
                break;
            }
            case 3: {
                System.out.println("Today is TUESDAY");
                break;
            }
            case 4: {
                System.out.println("Today is WEDNESDAY");
                break;
            }
            case 5: {
                System.out.println("Today is THURSDAY");
                break;
            }
            case 6: {
                System.out.println("Today is FRIDAY");
                break;
            }
            default: {
                System.out.println("Today is UNKNOWN DAY");
            }
        }
    }

    private static void ifThenElseSampleMethod(int i) {
        if (i % 2 == 1) {
            System.out.println("Today is NOT even day of the week");
        } else {
            System.out.println("Today is even day of the week");
        }

        String str = i % 2 == 1 ? "Today is NOT even day of the week" : "Today is NOT even day of the week";
        System.out.println(str);
    }


}
