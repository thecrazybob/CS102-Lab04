public class Item {

    // properties
    double weight;
    String content;

    // constructor
    public Item(double weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    // methods

    /**
     * Returns the weight of the Item
     * 
     * @return double
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Returns the content of the Item
     * 
     * @return String
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Returns the string representation of the Item
     * 
     * @return String
     */
    public String toString() {
        return "Weight: " + this.weight + " " + "Content: " + this.content;
    }

}
