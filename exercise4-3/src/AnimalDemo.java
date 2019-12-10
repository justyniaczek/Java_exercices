public class AnimalDemo {
    public static void main(String[] args) {
        Bird bird = new Bird("Ptaszyna");
        Horse horse = new Horse(" Koziolek");
        Pegasus pegasus = new Pegasus("Pegaz");

        horse.eat();
        horse.gallop();

        bird.eat();
        bird.fly();

        pegasus.eat();
        pegasus.fly();
        pegasus.gallop();
    }
}
