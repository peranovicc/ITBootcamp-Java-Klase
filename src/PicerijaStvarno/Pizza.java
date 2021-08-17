package PicerijaStvarno;

public class Pizza {
    private String id;
    private double price;
    private String name;
    private double size;

    public Pizza(String id, double price, String name, double size) {
        this.id = id;
        this.name = name;
        if(price <= 0){
            this.price = 1000;
            System.out.println("Постављена подразумевана вредност (јер сте унели не позитивну)");
        }
        else this.price = price;

        if(size <= 0){
            this.size = 42;
            System.out.println("Постављена подразумевана вредност (јер сте унели не позитивну)");
        }
        else this.size = size;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.out.println("Није промењена вредност");
            return;
        }

        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if(size <= 0){
            System.out.println("Није промењена вредност");
            return;
        }

        this.size = size;
    }

    public double getPricePerSquareCm(){
        double r = size / 2;

        return price / (r * r * Math.PI);
    }


    // Pizza: { name } | size: { size } | price: { price }
    // printf
    // String.format()
    @Override
    public String toString() {
        // return String.format("Pizza: %s | size: %.2f | price: %.2f", name, size, price);
        return "Pizza: " + name + " | size: " + size + " | price: " + price;
    }
}
