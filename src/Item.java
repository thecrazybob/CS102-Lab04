public class Item {

    double weight;
    String content;

    public Item(double weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public double getWeight() {
        return this.weight;
    }
    
    public String getContent() {
        return this.content;
    }

    public String toString() {
        return "Weight: " + this.weight + " " + "Content: " + this.content;
    }

}
