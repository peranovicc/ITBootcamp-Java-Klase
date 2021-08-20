package ProbniTest;

import java.util.ArrayList;

public class Test {

    // 1. Написати функцију која враћа низ који садржи најмањи и највећи елемент прослеђене листе int-ова
    //     - Ако се проследи ArrayList -> [1, -5, 10, 23, 99, 42]
    //     - Резултат је -> [-5, 99]
    public static int[] minimax(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(Integer a : arr){
            if(a < min){
                min = a;
            }
        }

        int max = arr.get(0);
        for(Integer a : arr){
            if(a > max){
                max = a;
            }
        }

        return new int[]{min,max};
    }

    public static void main(String[] args) {
        Ocena o1 = new Ocena(8,"OOP");
        Ocena o2 = new Ocena(5,"Programiranje 2");
        Ocena o3 = new Ocena(7,"Matematika");
        Ocena o4 = new Ocena(5,"Srpski");
        Ocena o5 = new Ocena(10,"SQL");
        Ocena o6 = new Ocena(9,"Programiranje 1");


        System.out.println("Тест за toString оцене:");
        System.out.println("Треба да испише: Predmet: OOP | Ocena: 8");
        System.out.println("Исписује:        " + o1);
        System.out.println("----------------------------");
        System.out.println("Тест за setVrednost (кад се унесе невалидна - порука)");
        System.out.println("Треба да избаци грешку");
        o1.setVrednost(4);
        System.out.println("----------------------------");
        System.out.println("Тест за setVrednost (кад се унесе невалидна - не мења се вредност)");
        System.out.println("Треба да испише: " + 8);
        System.out.println("Исписује:        " + o1.getVrednost());

        ArrayList<Ocena> ocene = new ArrayList<>();
        ocene.add(o1);
        ocene.add(o2);
        ocene.add(o3);
        ocene.add(o4);
        ocene.add(o5);
        ocene.add(o6);

        Student s = new Student("Indeks1","Pera","Peric",ocene);

        System.out.println("----------------------------");
        System.out.println("Тест за toString студента");
        System.out.println("Треба да пише:");
        System.out.println("Student: Pera\n" +
                "Predmet: OOP | Ocena: 8\n" +
                "Predmet: Programiranje 2 | Ocena: 5\n" +
                "Predmet: Matematika | Ocena: 7\n" +
                "Predmet: Srpski | Ocena: 5\n" +
                "Predmet: SQL | Ocena: 10\n" +
                "Predmet: Programiranje 1 | Ocena: 9");
        System.out.println();
        System.out.println("Пише:");
        System.out.println(s);
        System.out.println("----------------------------");

        System.out.println("Тест за највећу оцену");
        System.out.println("Треба да испише:");
        System.out.println("Predmet: SQL | Ocena: 10");
        System.out.println();
        System.out.println("Исписује:");
        System.out.println(s.najvecaOcena());
        System.out.println("----------------------------");

        System.out.println("Тест за просек оцена");
        System.out.println("Треба да испише: 7.333333333333333");
        System.out.println("Исписује:        " + s.prosekOcena());
        System.out.println("----------------------------");

        System.out.println("Тест за неположене предмете");
        System.out.println("Треба да испише: [Predmet: Programiranje 2 | Ocena: 5, Predmet: Srpski | Ocena: 5]");
        System.out.println("Исписује:        " + s.nepolozeniPredmeti());
    }
}
