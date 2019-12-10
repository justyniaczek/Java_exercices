public class Bird extends Animal implements BirdInterface {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eat() {
        System.out.println("bird is eating");
    }
}
