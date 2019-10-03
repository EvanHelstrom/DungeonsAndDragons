import java.util.*;
public class DungeonsAndDragons {

	public static void main(String[] args) {
		String sayings[] = {"Hello and welcome to my shop!","Hello traveler!","How can I help you?"};
		int randomKey = (int) Math.round(Math.random()*2);
		System.out.println(sayings[randomKey]);
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
	}

}
