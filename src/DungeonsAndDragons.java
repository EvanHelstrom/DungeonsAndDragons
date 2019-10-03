import java.util.*;
public class DungeonsAndDragons {

	public static void main(String[] args) {
		boolean proceed = false;
		String sayings[] = {"Hello and welcome to my shop!","Hello traveler!","How can I help you?"};
		int randomKey = (int) Math.round(Math.random()*2);
		System.out.println(sayings[randomKey]);
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Well hello " + name + ", its nice to see you.\nI have many items! Would you like to see them?");
		String input = scanner.nextLine();
		if(input.toLowerCase().equals("yes")) {
			proceed = true;
		}
		if(proceed) {
		System.out.println("Alright! Right this way....");
		}
		
	}

}
