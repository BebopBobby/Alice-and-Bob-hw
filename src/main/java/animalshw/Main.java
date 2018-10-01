package animalshw;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> pets = new HashMap<String, String>();
        System.out.println("How many pets you got, son????");
        int petAmount = sc.nextInt();

        while (petAmount != 0) {
            System.out.println("What's the pet breed, dawg??");
            String emptyLine1 = sc.nextLine();
            String breed = sc.nextLine();

            System.out.println("what's the pet's name??");
            String name = sc.nextLine();

            pets.put(breed, name);

            petAmount--;
        }
    }
}
