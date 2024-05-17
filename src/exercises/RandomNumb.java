package exercises;

import java.util.Random;

public final class RandomNumb {
    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(1000)+1;
    }
}
