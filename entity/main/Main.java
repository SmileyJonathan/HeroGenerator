package entity.main;

import java.util.*;

public class Main {


    public static void main (String[] args) {
        Map<Integer, String> powers = new HashMap<>();
        powers.put(1,"Fire");
        powers.put(2, "Water");
        powers.put(3, "Earth");
        powers.put(4, "Air");
        Random rand = new Random();
        int rand_int = rand.nextInt(4) + 1;

        Super supe = new Super();
        supe.setAbility(powers.get(rand_int));
		supe.setHeight(Randomizer.randomizeHeight());
        System.out.println(supe.getAbility());
		System.out.println(supe.getHeight());



    }
}
