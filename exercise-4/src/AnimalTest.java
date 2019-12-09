public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal mouse = new Mouse();
        cat.makeNoise();
        mouse.makeNoise();

        Animal[] myPets = new Animal[2];
        myPets[0] = cat;
        myPets [1] = mouse;
        for(Animal pet : myPets){
            pet.makeNoise();
        }
    }
}
