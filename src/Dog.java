import java.util.Scanner;

public class Dog {
    // Fields
    private String name;
    private String breed;
    private int age;
    private char sex; // 'M' || 'F'

    // Constructor - Како конструише објекат класе Dog
    public Dog(String _name, String _breed, int _age){
        // this - objekat klase Dog koji se trenutno kreira
        this.name = _name;
        this.breed = _breed;
        this.age = _age;
    }
    // Methods
    public void bark(){
        System.out.println("WOOF" + " " + this.name);
    }



    public void changeName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Dog max = new Dog("Max","Husky",3);
        Dog ppp = new Dog("sdgfs","3242",4);
        max.bark();
        ppp.bark();
        System.out.println(max.name);


        max.changeName("NijeMax");
        max.bark();

        // Automobil
        // Macka
        // Student
    }
}
