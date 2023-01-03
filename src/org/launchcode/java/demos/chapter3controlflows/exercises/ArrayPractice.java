package org.launchcode.java.demos.chapter3controlflows.exercises;

import java.util.Scanner;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        Part 1
        double[] intArray = {1,1,2,3,5,8};
//        Part 2
        for (int i=0; i<intArray.length; i++) {
            if (intArray[i]%2 != 0) {
//                System.out.println(intArray[i]);
            }
        }
//        Part 3
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] textArray = text.split(" ");
//        System.out.println(Arrays.toString(textArray));

//        Part 4 execution
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        numArray.add(1);
        numArray.add(2);
        numArray.add(4);
        numArray.add(3);
        numArray.add(13);
        numArray.add(22);
        numArray.add(67);
        numArray.add(96);

        int applyAddEvens = addEvens(numArray);
//        System.out.println(applyAddEvens);

//        Part 5 execution
        ArrayList<String> test = new ArrayList<String>();
        test.add("test");
        test.add("tidal");
        test.add("four");
        test.add("fives");
        test.add("donut");
        test.add("celery");
        test.add("two");
        test.add("nine");
        test.add("droop");
        test.add("practice");
        test.add("wrong");
        test.add("right");

        ArrayList<String> result = storeOnlyFiveLetters(test);
//        System.out.println(result.toString());

//        Part 6 execution
//        System.out.println("Choose a number of letters to look for ");
//        int wordCount = input.nextInt();
//        ArrayList<String> testTwo = new ArrayList<String>(Arrays.asList(textArray));
//        ArrayList<String> secondResult = storeOnlyXLetters(testTwo,wordCount);
//        System.out.println(secondResult.toString());

//        Part 7- Hashmap practice
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(1,"Sean Weissman");
        students.put(2,"Kat Evergreen");
        students.put(3,"Adam West");
        students.put(4,"Henry Cavill");
        students.put(5,"Wednesday Addams");
        students.put(6,"Sen Tran");
        students.put(7,"John Cousack");

        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println("\nID: "+ student.getKey() + "\nName: " + student.getValue());
        }

    }

//    Part 4
    public static int addEvens(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number: numbers) {
            if (number%2 ==0) {
                sum += number;
            }
        }
        return sum;
    }

//    Part 5
    public static ArrayList<String> storeOnlyFiveLetters (ArrayList<String> stringArray) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (String string: stringArray) {
            if (string.length() == 5) {
                newArray.add(string);
            }
        }
        return newArray;
    }

    public static ArrayList<String> storeOnlyXLetters (ArrayList<String> stringArray, int x) {
        ArrayList<String> newArray = new ArrayList<String>();
        if (x > 7 && x<0) {
            newArray.add("Can not execute");
        } else {
            for (String string: stringArray) {
                if (string.length() == x) {
                    newArray.add(string);
                }
            }
        }
        return newArray;
    }
}
