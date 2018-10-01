package animal;

public class animalsTest {
    public static void main(String[] args) {
        Dog fido = new Dog();
        Robodog virtualFido = new Robodog();

        System.out.println(fido.greet());
        System.out.println(virtualFido.greet());
    }
}
