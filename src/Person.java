public abstract class Person implements Locatable {

    // properties
    String name;
    int posX;
    int posY;

    // constructor with name and pos
    public Person(String name, int x, int y) {
        this.name = name;
        this.posX = x;
        this.posY = y;
    }

    // constructor with only name
    public Person(String name) {
        this.name = name;
    }

    // methods

    /**
     * Returns the name of the Person
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Person
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the X position of the Person
     * 
     * @return int
     */
    public int getX() {
        return this.posX;
    }

    /**
     * Returns the Y position of the Person
     * 
     * @return int
     */
    public int getY() {
        return this.posY;
    }

    /**
     * Sets both X and Y positions for the Person
     * 
     * @param x
     * @param y
     */
    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

}