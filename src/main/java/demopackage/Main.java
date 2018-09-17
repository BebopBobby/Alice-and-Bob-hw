package demopackage;
import jdk.internal.util.xml.impl.Input;

import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        String e = "";
//        String greeting = "Hello";
//        String ll = greeting.substring(2, 4);
//        String generalKenobi = greeting + " there!";
//        System.out.println(generalKenobi);


//Boolean yes = true;
//byte o = 20;
//char bluh = 'B';
//short k = 200;
//int x = 5;
//long l = 20000000;
//float g = 2;
//double h = 9.45;
//
//System.out.println(o);
//System.out.println(bluh);
//System.out.println(k);
//System.out.println(x);
//System.out.println(l);
//System.out.println(g);
//System.out.println(h);


//String comic = "Captain America";
//String america = comic.substring(8, 15);
//System.out.println(america);

// HOMEWORK-------------------------------------------------------------------------------
// System.out.println("Hello World");

//int myNumber = 80;
//short myShort = 678;
//long myLong = 8989;
//double myDouble = 4.3249;
//float myFloat = 234.1f;
//char myChar = 'H';
//boolean myBool = true;
//byte myByte = 127;
//System.out.println(myNumber);
//System.out.println(myShort);
//System.out.println(myLong);
//System.out.println(myDouble);
//System.out.println(myFloat);
//System.out.println(myChar);
//System.out.println(myBool);
//System.out.println(myByte);

//String myName = "Bobby";
//String faveColor = "green.";
//System.out.println(myName + "'s favorite color is " + faveColor);

//int x = 7;
//while(x <= 8) {
//    System.out.print(x + " Is less than 8");
//    break;
//}

//for(int l = 3; l > 7; l++) {
//    System.out.println(l);
//}

//int c = 5;
//if(5 <= 6) {
//    System.out.println("I'm tired.");
//}
//---------------------------------------------------------------------------------------------

//String nickName  = "Bobby";
//String lastName = "Galvin";
//String fullName = String.join(" ~ ", "OG Bobby Johnson","Galvin");
//System.out.println(fullName);

//        String greeting = "Hello";
//        "Hello".equals(greeting);
//        System.out.println("Hello".equals(greeting)); // use .equals method to compare strings; NEVER USE == TO COMPARE STRINGS

//        StringBuilder builder = new StringBuilder(); // you can use StringBuilder and .append to append strings instead of making new strings
//        builder.append("Mr ");
//        builder.append("Lover");
//        System.out.println(builder);

//          Scanner input = new Scanner(System.in);

//        System.out.println("What's your name, girl?");
//
//        String name = input.nextLine();
//
//        System.out.println("Your name is " + name);
//
//        System.out.println("What's your number, girl?");
//
//        long number = input.nextLong();
//
//        System.out.println("Your number is " + number);
//
//        System.out.println("Are you DTF?");
//
//        boolean dtf = input.nextBoolean();
//
//        if(dtf == true){
//            System.out.println("ayy esketit ;)");
//        } else{
//            System.out.println("lmk when you want this thang then.");
//        }

//        System.out.println("What are number 1 and number 2?");
//        int result = input.nextInt();
//        int result2 = input.nextInt();

//        System.out.println("the numbers are " + result + " and " + result2);
//          System.out.println("What do you want to do with " + result + " and " + result2 + "?");
//        String numbers = input.nextLine();
//
//
//
//            System.out.println("What is the sum of " + result + " and " + result2);
//            int sum = result + result2;
//            System.out.println("The sum of " + result + " and " + result2 + " is " + sum);
//
//            System.out.println("What is the product of " + result + " and " + result2 + "?");
//            int product = result * result2;
//            System.out.println("The product of " + result + " and " + result2 + " is " + product);
//
//            System.out.println("What is the remainder of " + result + " and " + result2 + "?");
//            int remain = result % result2;
//            System.out.println("The remainder of " + result + " and " + result2 + " is " + remain);


//        System.out.println("What is the sum of " + result + " and " + result2);
//        int sum = result + result2;
//        System.out.println("The sum of " + result + " and " + result2 + " is " + sum);

//        System.out.println("What is the product of " + result + " and " + result2 + "?");
//        int product = result * result2;
//        System.out.println("The product of " + result + " and " + result2 + " is " + product);

//        System.out.println("What is the remainder of " + result + " and " + result2 + "?");
//        int remain = result % result2
//        System.out.println("The remainder of " + result + " and " + result2 + " is " + remain);

//        System.out.printf("%s", "OG\nBobby\nJohnson");
//        System.out.printf("%+8d", 9);
//        System.out.printf("%5c", 'W');

//        String name1 = "Bob";
//        String name2 = "Alice";

//        int i = 1;
//        System.out.println("Welcome to my website!");
//
//        do{
//            System.out.println("Trial # " + i);
//            System.out.println("Incorrect password - Try Again");
//            i++;
//            if(i == 4){
//                System.out.println("You are locked out");
//            }
//        } while (i< 4);

//        System.out.println("Welcome, Please Login!");
//
//        String loginName = input.nextLine();
//        String bLogin = "Bob";
//        String aLogin = "Alice";
//        Boolean kBoolean = false;
//
//        while (kBoolean.equals(false)) {
//            if (loginName.equalsIgnoreCase(bLogin)) {
//                System.out.println("Welcome, Bob.");
//                break;
//            } else if (loginName.equalsIgnoreCase(aLogin)) {
//                System.out.println("Welcome, Alice.");
//                break;
//            } else if (!loginName.equalsIgnoreCase(" ")) {
//                System.out.println("Please try again");
//                loginName = input.nextLine();
//            }
//        }

// Problem 1
//        int i = 1;
//        do {
//            System.out.println(i);
//i = i + 2;
//        } while(i < 21);

// Problem 2
//int i = 1;
//
//do {
//    System.out.println(i * i);
//    i = i + 1;
//} while (i < 100);

// Problem 3
//        Scanner Input = new Scanner(System.in);
//        System.out.println("please enter a number");
//        int startNum = input.nextInt();
//        while(startNum <= 20){
//            System.out.println(startNum);
//            startNum++;
//        }

// Problem 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter two numbers");
//
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//
//        while(start != end){
//            System.out.printf(start + ",");
//            start++;
//        }
//        System.out.println(end);

        //Fibonacci sequence
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number:");
//        int stupidFibShit = sc.nextInt();
//        if (stupidFibShit > 1) {
//            System.out.printf("0, ");
//            int aaa = 0;
//            int shit = 1;
//            for(int fuck = 1; fuck + aaa < stupidFibShit;){
//                shit = fuck + aaa;
//                fuck = aaa;
//                aaa = shit;
//                System.out.printf(shit + ", ");
//            }
//        }

//  String mon = "Monday";
//  String wed = "Wednesday";
//  String fri = "Friday";
//  String today = "Tuesday";
//  if(mon.equals(today)){
//      System.out.println("today is Monday");
//  }else if(wed.equals(today)){
//      System.out.println("today is Wednesday");
//  }else if(fri.equals(today)){
//    System.out.println("today is Friday");
//  }else{
//      System.out.println("today is " + today);
//  }

//  for(int x = 0; x <5; x++){
//      System.out.println("gif move left and right five times then stops");
//  }

//        for (int x = 0; x < 9; x++){
//        System.out.printf("OG Bobby Johnson" + ", ");
//    }
//        System.out.printf("OG Bobby Johnson");

//        for (int x = 0; x >= 10; x = x * x){
//        System.out.println(x);
//    }

//        for(int x = 1; x <= 5; x++){
//            if(x == 3){
//                System.out.println("hip");
//            }else if(x == 5){
//                System.out.println("hop");
//            }else{
//                System.out.println(x);
//            }
//        }

//        for(int x = 1; x <= 20; x++){
//            if((x % 3 == 0) && (x % 5 == 0)){
//                System.out.println("Hip-hop");
//            }else if(x % 3 == 0){
//                System.out.println("Hip");
//            }else if(x % 5 == 0){
//                System.out.println("Hop");
//            }else {
//                System.out.println(x);
//            }
//        }

//        int month = 9;
//        String monthString;
//        switch (month){
//            case 1: monthString = "January";
//            break;
//            case 2: monthString = "February";
//            break;
//            case 3: monthString = "March";
//            break;
//            case 4: monthString = "April";
//            break;
//            case 5: monthString = "May";
//            break;
//            case 6: monthString = "June";
//            break;
//            case 7: monthString = "July";
//            break;
//            case 8: monthString = "August";
//            break;
//            case 9: monthString = "September";
//            break;
//            case 10: monthString = "October";
//            break;
//            case 11: monthString = "November";
//            break;
//            case 12: monthString = "December";
//            break;
//            default:
//                break;
//        }
//        System.out.println(monthString);

        //int day = 7;
//        int day = (int)(Math.random() * 7 + 1); //generates a number at random from 1 to 7; print 1 - 7
//        System.out.println(day);
//        String dayString;
//        switch(day){
//            case 1: dayString = "Monday";
//            break;
//            case 2: dayString = "Tuesday";
//            break;
//            case 3: dayString = "Wednesday";
//            break;
//            case 4: dayString = "Thursday";
//            break;
//            case 5: dayString = "Friday";
//            break;
//            case 6: dayString = "Saturday";
//            break;
//            case 7: dayString = "Sunday";
//            break;
//
//            default: dayString = "I don't know what day it is";
//            break;
//        }
//        System.out.println(dayString);

//        int roll = (int)(Math.random() * 7 + 1);
//        String rollString;
//        switch(roll){
//            case 1: rollString = "you rolled a 1";
//            break;
//            case 2: rollString = "you rolled a 2";
//            break;
//            case 3: rollString = "you rolled a 3";
//                break;
//            case 4: rollString = "you rolled a 4";
//                break;
//            case 5: rollString = "you rolled a 5";
//                break;
//            case 6: rollString = "you rolled a 6";
//                break;
//                default: rollString = "your dice fell off the table";
//                break;
//        }
//        System.out.println(rollString);

//        for(int x = 6; x >= 0; x--){
//            if(x == 2){
//                break;
//            }
//            System.out.println(x);
//        }

//      Question 1
//        String [] myFaveArtists = new String[3];
//        myFaveArtists[0] = "MF DOOM";
//        myFaveArtists[1] = "Wu Tang Clan";
//        myFaveArtists[2] = "GZA";
//
//        for(int x = 1; x > 0;){
//            System.out.println(myFaveArtists[0]);
//            System.out.println(myFaveArtists[1]);
//            System.out.println(myFaveArtists[2]);
//            break;
//        }

//        Question 2
//        int day = (int) (Math.random() * 7);
//        String[] daysOfTheWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
//        switch (day) {
//            case 0:
//                System.out.println(daysOfTheWeek[0]);
//                break;
//            case 1:
//                System.out.println(daysOfTheWeek[1]);
//                break;
//            case 2:
//                System.out.println(daysOfTheWeek[2]);
//                break;
//            case 3:
//                System.out.println(daysOfTheWeek[3]);
//                break;
//            case 4:
//                System.out.println(daysOfTheWeek[4]);
//                break;
//            case 5:
//                System.out.println(daysOfTheWeek[5]);
//                break;
//            case 6:
//                System.out.println(daysOfTheWeek[6]);
//                break;
//
//
//        }

//        Question 3
//int[] nums1 = {1, 2, 3, 4, 5};
//int[] nums2 = {4, 5, 7, 9, 2};
//int result = nums1[1] * nums2[2];
//        System.out.println(result);

//        Question 4
//        int num = (int) (Math.random() * 100);
//        if((num >= 0) && (num <= 59)){
//            System.out.println("you got an F");
//        }else if((num >= 60) && (num <= 69)){
//            System.out.println("you got a D");
//        }else if((num >= 70) && (num <= 79)){
//            System.out.println("you got a C");
//        }else if((num >= 80) && (num <= 89)){
//            System.out.println("you got a B");
//        }else if((num >= 90) && (num <= 100)){
//            System.out.println("you got an A");
//        }

//        Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?:");
//        String name = sc.nextLine();
//        System.out.println("What is your age?:");
//        int age = sc.nextInt();
//        int agePlus = age + 1;
//        System.out.println("hey " + name + " you will be " + agePlus + " years old next year.");

//        Question 6
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter a username:");
//
//        String user = sc.nextLine();
//
//        System.out.println("Please enter a password:");
//
//        String pass = sc.nextLine();
//
//        int tries = 1;
//
//        while(!pass.equals("TGIF") && tries < 3){
//            System.out.println("Wrong");
//
//            System.out.println("Please enter a username:");
//
//            user = sc.nextLine();
//
//            System.out.println("Please enter a password:");
//
//            pass = sc.nextLine();
//
//            tries++;
//        }if(tries == 3){
//            System.out.println("you're locked out");
//        }else{
//            System.out.println("welcome " + user);
//        }

//      Question 7
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int result = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9] / 10;
//        for(int x = 4; x > 3; x--){
//            System.out.println(result);
//            break;
//        }

//      Question 8
//        int[] lottoNumbers = {11,21,23,14,5,65};
//        int result = lottoNumbers[0] + lottoNumbers[1] + lottoNumbers[2] + lottoNumbers[3] + lottoNumbers[4] + lottoNumbers[5];
//        for(int y = 3; y > 2; y--){
//            System.out.println(result);
//            break;
//        }
//      Question 9
//        String bluh = "The big dog ran quickly past me.";
//        String wu = "Wu";
//        String tang = "Tang";




    }
}