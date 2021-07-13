package compare;

public class Item implements Comparable<Item> {

    private String name;
    private double weight;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }


    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public int compareTo(Item other) {
        if (this.weight < other.weight){
            return -1;
        } else if (this.weight > other.weight){
            return 1;
        } else {
            return 0;
        }
    }
}
