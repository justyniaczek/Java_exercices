public class Pegasus extends Horse implements BirdInterface {
    Pegasus(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("pegasus is flying");
    }

    @Override
    public void eat() {
        System.out.println("Pegasus is eating");
    }


}
