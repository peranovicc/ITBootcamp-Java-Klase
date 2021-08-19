package Overloading;

public class Primer {
    private String test;

    public Primer(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    // overload
    public static int zbir(int a, int b){
        return a + b;
    }
    // "1a2" "132432"
    public static int zbir(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    public static int zbir(int a, int b, int c){
        return a + b + c;
    }
    public static int zbir(int a, int b, int c,int d){
        return a + b + c + d;
    }

    @Override
    public String toString() {
        return "Primer{" +
                "test='" + test + '\'' +
                '}';
    }
}
