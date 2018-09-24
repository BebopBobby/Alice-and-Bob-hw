package mammal;

public class animalTest {
    public static void main(String[] args) {
        Animal animalOne = new Animal("eucalyptus leaves", "Koala", true);

        animalOne.setFood("Pellets");

        animalOne.eat();
        System.out.println(animalOne.eat());

        System.out.println(animalOne);

    }
}
