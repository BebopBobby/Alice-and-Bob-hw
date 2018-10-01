package animal;

public class Dog extends Canine implements IGreet {
    public String eat(){
        return "The dog eats kibbles and bits";
    }

    public String eat(String typeOfFood){
        return "the dog eats " + typeOfFood;
    }

    public String greet(){
        return "The dog wags its tail";
    }
}
