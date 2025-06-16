package entities;

public class operations {

    private final int id;
    private String name;
    private double amount;

    public operations(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }


    public operations(int id, String name){
        this.id = id;
        this.name = name;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }


    public void setIncreasedAmount(double amount) {
        this.amount = this.amount + amount;
    }
    public void setDecreasedAmount(double amount){
        this.amount = (this.amount - amount) -5;

    }
    public String toString(){
        return " \n Account " + id + ", Holder: " + name + ", Balance: $ " + amount ;
    }
}




