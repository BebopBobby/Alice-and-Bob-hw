package song.practice;

//public class Song{
//    String title;
//    String artist;
//
//    public Song(String title, String artist){
//        this.title = title;
//        this.artist = artist;
//    }
//
////    public void setTitle(String t){
////        this.title = t;
////    }
////
////    public void setArtist(String a){
////        this.artist = a;
////    }
//
//    public String getTitle(){
//        return title;
//    }
//
//    public String getArtist(){
//        return artist;
//    }
//
//    public String play(){
//        return artist + " played " + title;
//    }
//}

class Car {
    private String name;
    private String model;
    private int speed;

    public Car(String name, String model, int speed){
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setModel(String m){
        this.model = m;
    }

    public void setSpeed(int s){
        this.speed = s;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public int getSpeed(){
        return speed;
    }

    public String carInfo(){
        return "This car is a " + name + " " + model + " and it's top speed is " + speed;
    }

    public int AccelerateSpeed(){
        return speed + 20;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
