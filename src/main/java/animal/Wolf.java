package animal;

public class Wolf extends Canine {
    public String eat(){
        return "The wolf eats a bunny";
    }

    public String eat(String typeOfFood){
        return "The wolf eats " + typeOfFood;
    }
}
