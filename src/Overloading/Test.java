package Overloading;

public class Test {
    public static void main(String[] args) {
        Primer x = new Primer("TEST");
        System.out.println(Primer.zbir(5,6));
        System.out.println(Primer.zbir(2,1,10));
        System.out.println(Primer.zbir("0xA","0xB"));

        System.out.println();
    }
}
