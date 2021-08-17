package KlaseDan2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class Test {
    UUID x = new UUID(10,100);
    public static ArrayList<Dog> olderThan3(ArrayList<Dog> dogs){
        ArrayList<Dog> dogsOlder = new ArrayList<>();
        for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getAge() > 3){
                dogsOlder.add(dogs.get(i));
            }
        }
        return dogsOlder;
    }

    public static void main(String[] args) {
        Dog x1 = new Dog("Ime","Rasa",5);
        Dog x2 = new Dog("Ime2","Rasa2",3);

        ArrayList<Dog> lista = new ArrayList<>();
        lista.add(x1);
        lista.add(x2);

        System.out.println(Dog.countDogs);
        Dog.testStatic();

        DogList listaPasa = new DogList();
        DogList drugaLista = new DogList();

        listaPasa.add(x1);
        listaPasa.add(x2);

        System.out.println(listaPasa);

        ArrayList<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(7);
        System.out.println(x);
    }
}
