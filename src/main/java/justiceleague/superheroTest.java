package justiceleague;

public class superheroTest {
    public static void main(String[] args) {
        SuperHero shazam = new Shazam("Shazam", new String[] {"Wisdom of Solomon ", "Strength of Hercules ", "Stamina of Atlas ", "Power of Zeus ", "Courage of Achilles ", "Speed of Mercury"});

        SuperHero superMan = new SuperMan("Superman", new String[] {"Super Strength", "Super Speed", "Flight", "Ice Breath", "Laser Vision"});

        System.out.println(shazam.name + "'s powers are: " + shazam.printSuperPowers());

        System.out.println("=======================================================================================================================================================");

        System.out.println(superMan.name + "'s powers are " + superMan.printSuperPowers());
    }
}
