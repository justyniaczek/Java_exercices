public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
