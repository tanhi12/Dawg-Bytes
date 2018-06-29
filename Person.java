import java.util.*;

public class Person {
	private String name;
	private String nickname;
	private int age;
	
	public Person() {
		this.name = "";
		age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		Scanner scan = new Scanner(name);
		if (scan.hasNext()) {
			this.nickname = scan.next();
		}
	}
	
	public String name() {
		return this.name;
	}
	
	public int age() {
		return this.age;
	}
	
	public String nickname() {
		return this.nickname;
	}
}
