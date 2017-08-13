package model;

public class Whale {

    private String name;
    private int age;
    private Zookeeper caretaker;
    private double weight;
    private boolean waterType;

    public Whale(String nm, int age, Zookeeper zk, double wgt, boolean typ) {
        name = nm;
        this.age = age;
        caretaker = zk;
        weight = wgt;
        waterType = typ;
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public Zookeeper getCaretaker() { return caretaker; }
    public double getWeight() { return weight; }
    public boolean isWaterType() { return waterType; }


}