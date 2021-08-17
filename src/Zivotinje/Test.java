package Zivotinje;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Pas x = new Pas("IME",-4,"fdh3489rf7394","VLASNIK");
        Pas y = new Pas("IME2",4,"fdh3489rf754","VLASNIK");
        Pas z = new Pas("IME3",4,"fdh3489rf73456","VLASNIK");
        Pas t = new Pas("IME4",4,"fdh3489rf73458","VLASNIK");
        Pas s = new Pas("IME5",4,"fdh3489rf77867","VLASNIK");
        x.bark();
        x.setAge(-333);
        System.out.println(x.getAge());

    }
}
