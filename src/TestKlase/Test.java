package TestKlase;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Pesma p1 = new Pesma("Hibridicus Balcanicus", "[machina]", 333);
        Pesma p2 = new Pesma("Ostavi sve", "Max & Intro", 217);
        Pesma p3 = new Pesma("Maljciki", "Idoli", 201);
        Pesma p4 = new Pesma("Cudna suma", "YU Grupa", 218);
        Pesma p5 = new Pesma("Par godina za nas", "EKV", 252);
        Pesma p6 = new Pesma("San", "Romanticne boje", 254);
        Pesma p7 = new Pesma("Srce", "EKV", 219);
        Pesma p8 = new Pesma("Kofer ljubavi", "Kaliopi", 141);
        Pesma p9 = new Pesma("Kesten", "Alisa", 173);
        Pesma p10 = new Pesma("На заре", "Альянс", 356);


        String spacer = "--------------------------------------";
        // Test za toString pesme
        System.out.println("toString pesme:");
        System.out.println();
        System.out.println("Treba:    Cudna suma | YU Grupa | 3:38");
        System.out.println("Ispisuje: " + p4);
        System.out.println(spacer);
        // Test za menjanje imena izvodjaca - nevalidan unos
        System.out.println("setIzvodjac - nevalidna vrednost");
        System.out.println();
        System.out.println("Treba da ispise gresku i da vrednost bude nepromenjena");
        p4.setIzvodjac("pp");
        System.out.println();
        System.out.println("Treba:    " + "YU Grupa");
        System.out.println("Ispisuje: " + p4.getIzvodjac());
        System.out.println(spacer);

        List<Pesma> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);

        List<String> x = new ArrayList<>();

        Plejlista plejlista = new Plejlista("Random",lista);

        // Test za duzinaPlejliste
        System.out.println("Ukupna duzina:");
        System.out.println();
        System.out.println("Treba:    " + "2364");
        System.out.println("Ispisuje: " + plejlista.duzinaPlejliste());
        System.out.println(spacer);

        // Test za prosecnaDuzina
        System.out.println("Prosecna duzina:");
        System.out.println();
        System.out.println("Treba:    " + "236.4");
        System.out.println("Ispisuje: " + plejlista.prosecnaDuzina());
        System.out.println(spacer);


        // Test za kratkePesme
        System.out.println("Kratke pesme:");
        System.out.println();
        System.out.println("Treba:    " + "[Kofer ljubavi | Kaliopi | 2:21, Kesten | Alisa | 2:53]");
        System.out.println("Ispisuje: " + plejlista.kratkePesme());
        System.out.println(spacer);

        // Test za toString plejliste
        System.out.println("toStirng plejliste:");
        System.out.println();
        System.out.println("Treba:");
        System.out.println("""
                Plejlista: Random
                Ukupna duzina: 0:39:24
                Hibridicus Balcanicus | [machina] | 5:33
                Ostavi sve | Max & Intro | 3:37
                Maljciki | Idoli | 3:21
                Cudna suma | YU Grupa | 3:38
                Par godina za nas | EKV | 4:12
                San | Romanticne boje | 4:14
                Srce | EKV | 3:39
                Kofer ljubavi | Kaliopi | 2:21
                Kesten | Alisa | 2:53
                На заре | Альянс | 5:56
                """);
        System.out.println("Ispisuje:");
        System.out.println(plejlista);
        System.out.println(spacer);

        // Test za dodaj
        System.out.println("Test za dodavanje");
        Pesma novaPesma = new Pesma("Show must go on","Queen",263);
        plejlista.dodaj(novaPesma);
        System.out.println("Треба:    " + "Show must go on | Queen | 4:23");
        System.out.println("Исписује: " + plejlista.getPesme().get(plejlista.getPesme().size() - 1));
        System.out.println(spacer);
        // Test za ukloni
        System.out.println("Test za uklanjanje");
        System.out.println();
        plejlista.ukloni("Show must go on");
        System.out.println("Треба:    " + "На заре | Альянс | 5:56");
        System.out.println("Исписује: " + plejlista.getPesme().get(plejlista.getPesme().size() - 1));
        System.out.println(spacer);
        // Test za najduzu pesmu
        System.out.println("Test za najduzu pesmu");
        System.out.println();
        System.out.println("Треба:    " + "На заре | Альянс | 5:56");
        System.out.println("Исписује: " + plejlista.najduzaPesma());
        System.out.println(spacer);
        // Test za najkracu pesmu
        System.out.println("Test za najkracu pesmu");
        System.out.println();
        System.out.println("Треба:    " + "Kofer ljubavi | Kaliopi | 2:21");
        System.out.println("Исписује: " + plejlista.najkracaPesma());
    }
}
