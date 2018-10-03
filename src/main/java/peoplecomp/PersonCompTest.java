package peoplecomp;

import java.util.ArrayList;

public class PersonCompTest {
    public static void main(String[] args) {
        People person = new People();
        Person sumoZach = new Person(1);
        Person curlyFryDerian = new Person(2);


        curlyFryDerian.setName("Troy");
        person.add(curlyFryDerian);

        sumoZach.setName("Zach");
        person.add(sumoZach);

        System.out.println(person.getArray());

        System.out.println(person.getCount());

        person.remove(curlyFryDerian);

        System.out.println(person.getCount());

    }
}
