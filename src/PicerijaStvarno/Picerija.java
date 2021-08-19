package PicerijaStvarno;

import java.util.ArrayList;

public class Picerija {
    private ArrayList<Pizza> availablePizzas;
    private double totalIncome;
    private int totalSold;

    public Picerija(ArrayList<Pizza> availablePizzas) {
        this.availablePizzas = availablePizzas;
        this.totalIncome = 0;
        this.totalSold = 0;
    }
    public Picerija() {
        this.availablePizzas = new ArrayList<>();
        this.totalIncome = 0;
        this.totalSold = 0;
    }

    public void addAvailable(Pizza p){
        availablePizzas.add(p);
    }

    public ArrayList<Pizza> getAvailablePizzas() {
        return availablePizzas;
    }

    public void setAvailablePizzas(ArrayList<Pizza> availablePizzas) {
        this.availablePizzas = availablePizzas;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void sellPizza(Pizza p){
        boolean isAvailable = false;
        String id = p.getId();
        for(int i = 0; i < availablePizzas.size(); i++){
            Pizza current = availablePizzas.get(i);
            if(id.equals(current.getId())){
                isAvailable = true;
                break;
            }
        }

        if(isAvailable){
            totalSold++;
            totalIncome += p.getPrice();
        }
        else{
            System.out.println("Није доступна");
        }

    }
    // (Цена по квадратном центиметру)
    public Pizza getCheapestPizza(){
        Pizza cheapest = availablePizzas.get(0);
        for(Pizza p: availablePizzas){
            if(p.getPricePerSquareCm() < cheapest.getPricePerSquareCm()){
                cheapest = p;
            }
        }
        return cheapest;
    }

    @Override
    public String toString() {
        return "Picerija{" +
                "availablePizzas=" + availablePizzas +
                ", totalIncome=" + totalIncome +
                ", totalSold=" + totalSold +
                '}';
    }
}
