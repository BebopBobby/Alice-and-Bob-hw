package demopackage;
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
//System.out.println("Bobby's favorite color is " + faveColor);
//
//int x = 7;
//while(x < 8) {
//    System.out.print(x + " Is less than 8");
//        break;
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

        Scanner input = new Scanner(System.in);

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

        System.out.println("Welcome, Please Login!");

        String loginName = input.nextLine();
        String bLogin = "Bob";
        String aLogin = "Alice";
        Boolean kBoolean = false;

        while (kBoolean.equals(false)) {
            if (loginName.equalsIgnoreCase(bLogin)) {
                System.out.println("Welcome, Bob.");
                break;
            } else if (loginName.equalsIgnoreCase(aLogin)) {
                System.out.println("Welcome, Alice.");
                break;
            } else if (!loginName.equalsIgnoreCase(" ")) {
                System.out.println("Please try again");
                loginName = input.nextLine();
            }
        }











    }
}
