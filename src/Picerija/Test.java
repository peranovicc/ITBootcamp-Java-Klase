package Picerija;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Izracunati zbir cena svih pica

        ArrayList<Integer> y = new ArrayList<>();
        y.add(5);
        y.add(6);
        y.add(7);
        y.add(8);
        y.add(1);

        ArrayList<Pizza> x = new ArrayList<>();
        x.add(new Pizza(32.4,24,"Nesto"));
        x.add(new Pizza(355,24,"NekaDruga"));
        x.add(new Pizza(33.3,24,"Pet"));
        x.add(new Pizza(32.1,32,"fkjsdfs"));
        x.add(new Pizza(58.3,28,"324823"));

        double sum = 0;
        for(Pizza p : x){
            sum += p.getCena();
        }
        System.out.println(sum);
    }
}






