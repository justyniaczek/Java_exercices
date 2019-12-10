public class Horse extends Animal {
    Horse(String name) {
        super(name);
    }

    public void gallop() {
        System.out.println("im galloping ");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }
}
