package peoplecomp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {
    private Person person;
    ArrayList<Person> personList = new ArrayList<Person>();


    public void add(Person t){
        personList.add(t);
    }

    public Person findById(long id){
        for (Person person:personList) {
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void remove(long id){
        for (Person person: personList) {
            if (id == person.getId()){
                personList.remove(id);
            }
        }
    }

    public void remove(Person g){
        for (Person person: personList){
            if (g == person){
                personList.remove(g);
            }
        }
    }

    public int getCount(){
        return personList.size();
    }

    public Object getArray(){
        return personList.toString();
    }

    public void removeAll(){
        personList.clear();
    }
}