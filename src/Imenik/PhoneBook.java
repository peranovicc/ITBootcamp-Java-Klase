package Imenik;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Entity> entry;

    public PhoneBook(ArrayList<Entity> entry) {
        this.entry = entry;
    }

    public PhoneBook() {
        entry = new ArrayList<>();
    }

    public void add(Entity e){

    }

    public void update(String id, String name){

    }

    public void update(String id, String name, String number){

    }
// search(String s) - Враћа први ентитет чије име или број почињу са s
    public Entity search(String s){
        return null;
    }
    // searchAll(String s) - Враћа све ентитете чије име или број почињу са s
    public ArrayList<Entity> searchAll(String s){
        return null;
    }

    public void remove(String name){

    }
}
