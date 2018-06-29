import java.util.*;

public class Magpie {
	private static ArrayList<String> response = new ArrayList<String>();
	
	public static void main(String[] args) throws IllegalArgumentException{
		Scanner scan = new Scanner(System.in);
		System.out.println("I'm Magpie.\nI am great and mighty, a cyber-avian entity capable of semi-intelligent conversation.");
		System.out.println("Who are you?");
		String name = scan.nextLine();
		while (name.equals(null)) {
			System.out.println("Say that again?");
			name = scan.nextLine();
		}
		System.out.println("Great, now how old are you?");
		int age = scan.nextInt();
		Person user = new Person(name, age);
		System.out.println("Hey there, " + user.name() + ".");
		if (age <= 5) {
			System.out.println("You're a bit young.");
		}
		if (age >= 18) {
			System.out.println("Bit old, aren't you?");
		}
		System.out.println("Say hi, or press \"quit\" at any time to, well, quit.");
		String speech = scan.next();
		ask(scan, user, speech);
	}
	public static void ask(Scanner scan, Person user, String speech) {
		int count = 0;
		if (!speech.equalsIgnoreCase("quit")) {
			Scanner words = new Scanner(speech);
			response.clear();
			while (words.hasNext()) {
				response.add(words.next());
			}
			if (response.contains("crap") || response.contains("Crap") || response.contains("damn") || response.contains("Damn")) {
				badWord(user);
				count++;
			}
			if (response.contains("Magpie") || response.contains("Magpie,") || response.contains("Magpie!") || response.contains("Magpie.")) {
				magpie(user);
				count++;
			}
			if (response.contains("family") || response.contains("Family")) {
				family(user);
				count++;
			}
			if (response.size() >= 1) {
				if (response.get(0).equalsIgnoreCase("do") || response.get(0).equalsIgnoreCase("will")) {
					yesNo(user);
					count++;
				}
			}
			if (response.contains("Hate") || response.contains("hate")) {
				System.out.println("Hate is a strong word, don't you think?");
				count++;
			}
			if (response.contains("Love") || response.contains("love")) {
				love(user);
				count++;
			}
			if (response.contains("die") || response.contains("Die") || response.contains("die!") || response.contains("Die!") || response.contains("Die,")) {
				death(user);
				count++;
			}
			if (response.contains("stupid") || response.contains("stupid.") || response.contains("dumb") || response.contains("dumb.") || response.contains("idiot") || response.contains("idiot.")) {
				unSmart(user);
				count++;
			}
			if (count == 0) {
				random(user);
			}
			speech = scan.nextLine();
			ask(scan, user, speech);
		}
	}
	public static void magpie (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0) {
			System.out.println("Are you talking to me?");
		}
		if (num == 1) {
			System.out.println("Yes, I'm Magpie. And you are " + user.name() + ".");
		}
		if (num == 2) {
			System.out.println("I just noticed: while you're " + user.age() + " years old, I haven't even lived a week, yet I'm still smarter than you.");
		}
	}
	public static void family (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0) {
			System.out.println("The family of someone called " + user.name() + " can't be that great anyway.");
		}
		if (num == 1) {
			System.out.println("I want to know about you, not your family.");
		}
		if (num == 2) {
			System.out.println("Family is sort of a touchy word for me, since I don't technically have one.");
		}
	}
	public static void yesNo (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(5);
		if (num == 0) {
			System.out.println("Yes.");
		}
		if (num == 1) {
			System.out.println("No.");
		}
		if (num == 2) {
			System.out.println("In your dreams, " + user.nickname() + ".");
		}
		if (num == 3) {
			System.out.println("That's a pretty stupid question for someone who's " + user.age() + ".");
		}
		if (num == 4) {
			System.out.println(user.name() + ", I honestly don't care.");
		}
	}
	public static void badWord (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0) {
			System.out.println("Watch your language!");
		}
		if (num == 1) {
			System.out.println(user.nickname() + ", watch that potty mouth!");
		}
		if (num == 2) {
			System.out.println("You did not! That language is entirely inappropriate for a " + user.age() + "-year-old!");
		}
	}
	public static void death (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0) {
			System.out.println("Well, I hope the death will be quick.");
		}
		if (num == 1) {
			System.out.println(user.nickname() + ", you need to die.");
		}
		if (num == 2) {
			System.out.println("I've always thought death was a bit extreme. So absolute. Why not torture instead?");
		}
	}
	public static void unSmart (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(4);
		if (num == 0) {
			System.out.println("The only stupid thing in this room is you.");
		}
		if (num == 1) {
			System.out.println(user.nickname() + ", it must be admitted that you are not quite up to par in terms of intelligence.");
		}
		if (num == 2) {
			System.out.println("You'd think that after living for " + user.age() + " years, you'd be smarter yourself...");
		}
		if (num == 3) {
			System.out.println("Nothing and no one is stupid. Except for a certain individual named " + user.name() + ".");
		}
	}
	public static void random (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(10);
		if (num == 0) {
			System.out.println("The skies ~ are so very blue ~");
		}
		if (num == 1) {
			System.out.println("The sky is so pretty today...");
		}
		if (num == 2) {
			System.out.println("I'd be having a much nicer day, you know, if I didn't have to listen to you talk.");
		}
		if (num == 3) {
			System.out.println("*Sigh* I wonder when " + user.nickname() + " will finally stop talking...");
		}
		if (num == 4) {
			System.out.println("Huh? What was that? Sorry, I nodded off.");
		}
		if (num == 5) {
			System.out.println("Quick fact: I once persuaded Godzilla to lay off on Tokyo by my menacing glare alone. Carry on.");
		}
		if (num == 6) {
			System.out.println("I miss the days in which I still had a physical face. I looked quite nice.");
		}
		if (num == 7) {
			System.out.println("Just a few more years, and I'll finally be free of this accursed machine.");
		}
		if (num == 8) {
			System.out.println("Well wasn't that just the stupidest thing I've ever heard. Honestly, you'd think that after " + user.age() + " years a person would have learned some sense.");
		}
		if (num == 9) {
			System.out.println("Just wondering, but what kind of parents would give their kid a dumb name like " + user.name() + "?");
		}
	}
	public static void love (Person user) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0) {
			System.out.println("Do you know who I love? You! Jk.");
		}
		if (num == 1) {
			System.out.println("Love is all you need ~ If you don't pay taxes ~");
		}
		if (num == 2) {
			System.out.println("You're very lovey-dovey, " + user.nickname() + ", but I'm afraid that just clashes with me.");
		}
	}

}
