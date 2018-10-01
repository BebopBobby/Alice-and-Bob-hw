package foods;

public class Chilis extends Restaurant {
    @Override
    void waiters() {
        System.out.println("There are " + 10 + " waiters at Chili's");
    }

    @Override
    void haters(){
        System.out.println("There are " + 0 + " haters at Chili's");
    }
}
