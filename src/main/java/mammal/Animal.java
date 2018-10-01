package mammal;

public class Animal {
    private String food;
    protected String breed;
    public boolean isMammal;

    public Animal(String food, String breed, boolean isMammal){
        this.food = food;
        this.breed = breed;
        this.isMammal = isMammal;
    }

    public void setFood(String f){
        this.food = f;
    }

    public String getFood(){
        return food;
    }

    public String eat(){
        return "The " + breed + " eats " + food + ".";
    }

    @Override
    public String toString() {
        return "Animal [" + "foods = " + food + " Breed = " + breed + "]";
    }
}
