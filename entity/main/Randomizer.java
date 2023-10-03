package entity.main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Randomizer {

	public static Random rand = new Random();

	public void randomizeSuper(Super supe) {
		supe.setGender(randomizeGender());
		supe.setSexuality(randomizeSexuality(supe.getGender()));
		supe.setType(randomizeType());
		supe.setHeight(randomizeHeight());
		supe.setWeight(randomizeWeight());
//		supe.setHairType(randomizeHairType());
//		supe.setHairColor(randomizeHairColor());
//		supe.setNationality(randomizeNationality());
//		supe.setEthnicity(randomizeEthnicity());
//		supe.setSkinColor(randomizeSkinColor());
//		supe.setEyeColor(randomizeEyeColor());
//		supe.setAbility(randomizeAbility());


	}

	public static char randomizeGender() {
		Map<Integer, Character> genderMap = new HashMap<>();
		genderMap.put(1, 'M');
		genderMap.put(2, 'F');
		return genderMap.get(rand.nextInt(2) + 1);
	}

	public static String randomizeSexuality(char gender) {
		String[] sexualities = new String[]{"Straight", "Gay", "Lesbian", "Bisexual", "Transgender", "Queer", "Intersex", "Asexual", "Demisexual", "Pansexual"};
		Map<Integer, String> genderMap = new HashMap<>();
		for (int i = 0; i < sexualities.length - 1; i++) {
			switch(gender) {
				case 'M':
					if (sexualities[i].equals("Lesbian")) {
						continue;
					}
					break;
				case 'F':
					if (sexualities[i].equals("Gay")) {
						continue;
					}
					break;
			}
			genderMap.put(i, sexualities[i]);
		}
		return genderMap.get(rand.nextInt(sexualities.length));
	}

	public static String randomizeType() {
		Map<Integer, String> genderMap = Stream.of(new Object[][] {
				{ 1, "Hero" },
				{ 2, "Villain" },
				{ 3, "Anti-Hero" },
				{ 4, "Monster" },
				{ 5, "Neutral" },
		}).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

		return genderMap.get(rand.nextInt(5) + 1);
	}

	public static String randomizeHeight() {
		int random = rand.nextInt(9) + 68;
		if (random - 60 < 12) {
			String inches = String.valueOf(random - 60);
			return "5'" + inches + "\"";
		}
		else {
			String inches = String.valueOf(random - 72);
			return "6'" + inches + "\"";
		}
	}

	public static int randomizeWeight() {
		return rand.nextInt(100) + 150;
	}

//	public static String randomizeHairType() {
//
//	}

//	public static String randomizeHairColor() {
//
//	}
//
//	public static String randomizeNationality() {
//
//	}
//
//	public static String randomizeEthnicity() {
//
//	}
//
//	public static String randomizeSkinColor() {
//
//	}
//
//	public static String randomizeEyeColor() {
//
//	}
//
//	public static String randomizeAbility() {
//
//	}

}

	