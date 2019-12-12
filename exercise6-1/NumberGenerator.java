import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
    Set<Integer> numberGenerator = new HashSet<>();

    public void generateNumbers() {

        Random rand  = new Random();
        while(numberGenerator.size() < 6) {
            Integer i = 1 + rand.nextInt(49);
            numberGenerator.add(i);
    }
    }
    public Set<Integer> getNumberGenerator(){
        return numberGenerator;
    }
}
