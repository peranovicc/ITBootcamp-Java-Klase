package KlaseDan2;

import java.util.ArrayList;

public class DogList {
    private ArrayList<Dog> dogs;

    public DogList() {
        dogs = new ArrayList<Dog>();
        // this.dogs = new ArrayList<Dog>();
    }

    public void add(Dog dog){
        dogs.add(dog);
    }

    // Направити методу која враћа текст у сл. формату:
    // [ {imePsa1} , {imePsa2} , ... , {imePsaN} ]
    // @Override
    // public String toString() {
    //     String s = "[ ";
    //     for(Dog dog : this.dogs){
    //         s = s.concat(dog.getName()).concat(", ");
    //     }
    //     s = s.substring(0,s.length() - 2);
    //     s = s.concat(" ]");
    //
    //     return s;
    // }


    @Override
    public String toString() {
        return "DogList{" +
                "dogs=" + dogs +
                '}';
    }
}
