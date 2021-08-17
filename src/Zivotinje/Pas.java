package Zivotinje;

public class Pas {
    private String name;
    private int age;
    private String id;
    private String owner;

    public Pas(String name, int age, String id, String owner) {
        this.name = name;
        this.id = id;
        this.owner = owner;
        if(age >= 0){
            this.age = age;
        }
        else{
            this.age = 0;
            System.out.println("Uneli ste nevalidnu vrednost za godine, postavljena podrazumevana (0) | id: " + this.id); // Логовање упозорења
            // throw new Error(); // Бацање грешке!
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }
        else {
            this.age = 0;
            System.out.println("Uneli ste nevalidnu vrednost za godine, postavljena podrazumevana (0) | id: " + this.id); // Логовање упозорења
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void bark(){
        System.out.println("WOOF");
    }


}
