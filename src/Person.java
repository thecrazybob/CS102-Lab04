public abstract class Person implements Locatable {
    
    String name;
    int posX;
    int posY;

    public Person(String name, int x, int y) {
        this.name = name;
        this.posX = x;
        this.posY = y;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return this.posX;
    }

    public int getY() {
        return this.posY;
    }

    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

}