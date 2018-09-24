package song.practice;

public class Main {
    public static void main(String[] args) {
//        Song songLa = new Song("Liquid Swords", "GZA");
//        songLa.setArtist("Adele");
//        songLa.setTitle("I don't know");
//        System.out.println(songLa.play());

        Car newVehicle = new Car("Suzuki", "Swift", 140);
        newVehicle.setSpeed(180);

        newVehicle.getModel();
        System.out.println(newVehicle.getModel());

        System.out.println(newVehicle);

        newVehicle.AccelerateSpeed();
    }
}
