package exercises;

import java.util.Random;

public final class RandomNumb {

   private RandomNumb(){};

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(1,1000);

    }
}
