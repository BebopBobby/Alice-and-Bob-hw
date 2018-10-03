package peoplecomp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {
    public ArrayList<Person> personList;


    public void add(Person p){
        personList.add(p);
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

    public void remove(Person p){
        for (Person p : personList){
            if (Person == p){
                personList.remove(p);
            }
        }
    }

    public int getCount(){
        return personList.size();
    }

    public Object getArray(){
        return personList.toArray();
    }

    public void removeAll(){
        personList.clear();
    }
}