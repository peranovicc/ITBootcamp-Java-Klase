package PicerijaStvarno;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("1",358.99,"Pepperoni", 24);
        Pizza p2 = new Pizza("22",438.81,"Chicken", 32);
        Pizza p3 = new Pizza("44",520.5,"Capricciosa", 32);
        Pizza p4 = new Pizza("33",487.68,"Pepperoni", 28);
        Pizza p5 = new Pizza("1111",600.54,"Ortalona", 32);
        Pizza p6 = new Pizza("1122",554.5,"Genovese", 28);
        Pizza p7 = new Pizza("1131",425.88,"Fugazza", 26);
        Pizza p8 = new Pizza("1333",497.58,"Quatro stagioni", 26);
        Pizza p9 = new Pizza("1818",638.99,"Quatro stagioni", 32);

        ArrayList<Pizza> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Picerija picerija = new Picerija(lista);
        picerija.addAvailable(p4);

        Picerija picerijaBezParametara = new Picerija();
        picerijaBezParametara.addAvailable(p4);
        picerijaBezParametara.addAvailable(p7);

        picerija.sellPizza(p1);
        picerija.sellPizza(p2);
        picerija.sellPizza(p9);
        System.out.println(picerija);



    }
}
